package at.ooe.fh.mc.codespeech.general.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.text.WordUtils;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.PrefixExpression;
import org.eclipse.jdt.core.dom.StringLiteral;

/**
 * Utility class providing methods necessary for parsing strings
 * recognized from speech to AST Expressions
 * 
 * @author Lukasz Strzelecki
 *
 */
public class StringUtils {

	/**
	 * Interprets string and returns proper expression. Expressions can be infix, postfix or prefix.
	 * (E.g. i < 0, i++, !false). Mainly used for if, else, or loop conditions;
	 * 
	 * @param stringExpression string to retrieve expression from
	 * @param ast to which expression will be added. Needed for creation of new expressions
	 * @return
	 */
	public static Expression stringToExpression(String stringExpression, AST ast) {
		Expression expression = null;

		if(isInfix(stringExpression)) {
			InfixExpression infixExpression  = ast.newInfixExpression();
			infixExpression.setLeftOperand(getLeftOperandFromString(stringExpression, ast));
			infixExpression.setRightOperand(getRightOperandFromString(stringExpression, ast));
			infixExpression.setOperator(getOperatorFromString(stringExpression));
			expression = infixExpression;
		} else if(isPrefix(stringExpression)){
			PrefixExpression prefixExpression = ast.newPrefixExpression();
			prefixExpression.setOperator(PrefixExpression.Operator.NOT);
			prefixExpression.setOperand(ast.newName(stringExpression.replace("!", "")));
			expression = prefixExpression;
		} else {
			expression = getProperLiteral(stringExpression, ast);
		}

		return expression;
	}

	/**
	 * Checks if expression is of infix type
	 * 
	 * @param expression String to check
	 * @return true if expression was recognized as infix, false if not
	 */
	private static boolean isInfix(String expression) {
		Matcher matcher = getComparatorMatcher(expression);
		return matcher.find();
	}	

	/**
	 * Checks if expression is of prefix type
	 * 
	 * @param expression String to check
	 * @return true if expression was recognized as prefix, false if not
	 */
	private static boolean isPrefix(String expression) {
		return expression.startsWith("!");
	}	

	/**
	 * Retrieves left hand side of the expression
	 * 
	 * @param expression String to retrieve left hand side from
	 * @param ast AST needed to create new Expression
	 * @return left hand side expression
	 */
	private static Expression getLeftOperandFromString(String leftOperandString, AST ast) {
		Matcher matcher = getComparatorMatcher(leftOperandString);
		matcher.find();
		String leftOperand = leftOperandString.substring(0, matcher.start()).trim();
		return getProperLiteral(leftOperand, ast);
	}

	/**
	 * Retrieves right hand side of the expression
	 * 
	 * @param expression String to retrieve right hand side from
	 * @param ast AST needed to create new Expression
	 * @return right hand side expression
	 */
	private static Expression getRightOperandFromString(String rightOperandString, AST ast) {
		Matcher matcher = getComparatorMatcher(rightOperandString);		
		matcher.find();
		String rightOperand = rightOperandString.substring(matcher.end(), rightOperandString.length()).trim();                      
		return getProperLiteral(rightOperand, ast);
	}

	/**
	 * Looks for comparator sign and return Matcher after performing a search on the string
	 * 
	 * @param stringToMatch string to find comparator for
	 * @return Matcher after performing find()
	 */
	private static Matcher getComparatorMatcher(String stringToMatch) {
		String comparators = "is less than | is less or equal to | "
							+ "is greater than | is greater or equal to |"
							+ "is equal to | equals | is not equal to | is different than"; //==|!=|>=|<=|<|>";
		Pattern pattern = Pattern.compile(comparators);
		Matcher matcher = pattern.matcher(stringToMatch);
		//matcher.find();
		return matcher;
	}

	/**
	 * Returns proper infix operator
	 * 
	 * @param operatorString operator in string form
	 * @return Proper AST Infix operator
	 */
	private static InfixExpression.Operator getOperatorFromString(String operatorString) {
		InfixExpression.Operator operator = null;
		if(operatorString.contains("is different than") || operatorString.contains("is not equal")) {
			operator = InfixExpression.Operator.NOT_EQUALS;
		} else if(operatorString.contains("is equal to") || operatorString.contains("equals")) {
			operator = InfixExpression.Operator.EQUALS;
		} else if(operatorString.contains("is less or equal to") || operatorString.contains("is smaller or equal to")) {
			operator = InfixExpression.Operator.LESS_EQUALS;
		} else if(operatorString.contains("is greater or equal to") || operatorString.contains("is bigger or equal to")) {
			operator = InfixExpression.Operator.GREATER_EQUALS;
		} else if(operatorString.contains("is greater than") || operatorString.contains("is bigger than")) {
			operator = InfixExpression.Operator.GREATER;
		} else if(operatorString.contains("is less than") || operatorString.contains("is smaller than")) {
			operator = InfixExpression.Operator.LESS;
		} 
		return operator;
	}

	/**
	 * Returns a proper literal from the string (either NumberLiteral, BooleanLiteran,
	 * NullLiteral or Name)
	 * 
	 * @param expressionString string to parse
	 * @param ast needed to get a proper expression
	 * @return Expression matching the string
	 */
	private static Expression getProperLiteral(String expressionString, AST ast) {
		Expression expression = null;
	
		if(isNumeric(expressionString)) {
			expression = ast.newNumberLiteral(expressionString);
		} else if(isBoolean(expressionString)) {
			expression = ast.newBooleanLiteral(Boolean.valueOf(expressionString));
		} else if(isNullLiteral(expressionString)) {
			expression = ast.newNullLiteral();
		} 
		else {
			expression = ast.newSimpleName(expressionString);
		}

		return expression;
	}
	
	public static Expression getStringLiteral(String expressionString, AST ast) {
		Expression expression = null;
		
		expression = ast.newStringLiteral();
		((StringLiteral) expression).setLiteralValue(expressionString);
		
		return expression;
	}

	/**
	 * Checks if the string is a number (digit, not literal) e.g. "4", 65", not "four"
	 *
	 * @param stringToCheck
	 * @return true if string was recognized as a number, false if not
	 */
	public static boolean isNumeric(String stringToCheck) {
		return stringToCheck.matches("-?\\d+(\\.\\d+)?(\\w)?");
	}

	/**
	 * Checks if the string is boolean literal - either true or false
	 * 
	 * @param stringToCheck
	 * @return true if string is a boolean literal, false if not
	 */
	private static boolean isBoolean(String stringToCheck) {
		return stringToCheck.matches("true|false");
	}	

	/**
	 * Checks if the string is "null"
	 * 
	 * @param stringToCheck
	 * @return true if string is equal to "null", false if not
	 */
	private static boolean isNullLiteral(String stringToCheck) {
		return stringToCheck.matches("null");
	}
	
	public static String toCamelCase(String stringToModify) {
		if(stringToModify.isEmpty()) {
			return "";
		} else {
			String newString = stringToModify.trim();
			String first = newString.substring(0, 1).toLowerCase();
			String second = WordUtils.capitalize(newString).substring(1);
			newString = first + second;
			newString = newString.replace(" ", "");
			return newString;
		}
	}

	public static String toPascalCase(String stringToModify) {
		return WordUtils.capitalize(stringToModify).replace(" ", "").trim();
	}

	public static String toDotSeparated(String stringToModify) {
		return stringToModify.trim().toLowerCase().replace(" ", ".");
	}

	public static int getNumber(String text) {
		int number = -1;
		if(StringUtils.isNumeric(text)) {
			try {
				number = Integer.parseInt(text);
			} catch (NumberFormatException e) {
				e.printStackTrace();				
			}
		} else {
			int numeric = WordToNumber.convert(text);
			if(numeric >= 0) {
				number = numeric;
			}
		}
		return number;
	}
}
