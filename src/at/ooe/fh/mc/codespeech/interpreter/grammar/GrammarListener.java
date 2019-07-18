package at.ooe.fh.mc.codespeech.interpreter.grammar;
// Generated from Grammar.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(GrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(GrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#creation}.
	 * @param ctx the parse tree
	 */
	void enterCreation(GrammarParser.CreationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#creation}.
	 * @param ctx the parse tree
	 */
	void exitCreation(GrammarParser.CreationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#creationVerb}.
	 * @param ctx the parse tree
	 */
	void enterCreationVerb(GrammarParser.CreationVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#creationVerb}.
	 * @param ctx the parse tree
	 */
	void exitCreationVerb(GrammarParser.CreationVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#structure}.
	 * @param ctx the parse tree
	 */
	void enterStructure(GrammarParser.StructureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#structure}.
	 * @param ctx the parse tree
	 */
	void exitStructure(GrammarParser.StructureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#selection}.
	 * @param ctx the parse tree
	 */
	void enterSelection(GrammarParser.SelectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#selection}.
	 * @param ctx the parse tree
	 */
	void exitSelection(GrammarParser.SelectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#selectionVerb}.
	 * @param ctx the parse tree
	 */
	void enterSelectionVerb(GrammarParser.SelectionVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#selectionVerb}.
	 * @param ctx the parse tree
	 */
	void exitSelectionVerb(GrammarParser.SelectionVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#navigation}.
	 * @param ctx the parse tree
	 */
	void enterNavigation(GrammarParser.NavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#navigation}.
	 * @param ctx the parse tree
	 */
	void exitNavigation(GrammarParser.NavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lineNavigation}.
	 * @param ctx the parse tree
	 */
	void enterLineNavigation(GrammarParser.LineNavigationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lineNavigation}.
	 * @param ctx the parse tree
	 */
	void exitLineNavigation(GrammarParser.LineNavigationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#navigationVerb}.
	 * @param ctx the parse tree
	 */
	void enterNavigationVerb(GrammarParser.NavigationVerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#navigationVerb}.
	 * @param ctx the parse tree
	 */
	void exitNavigationVerb(GrammarParser.NavigationVerbContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#lineKeyword}.
	 * @param ctx the parse tree
	 */
	void enterLineKeyword(GrammarParser.LineKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#lineKeyword}.
	 * @param ctx the parse tree
	 */
	void exitLineKeyword(GrammarParser.LineKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#modification}.
	 * @param ctx the parse tree
	 */
	void enterModification(GrammarParser.ModificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#modification}.
	 * @param ctx the parse tree
	 */
	void exitModification(GrammarParser.ModificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initialization}.
	 * @param ctx the parse tree
	 */
	void enterInitialization(GrammarParser.InitializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initialization}.
	 * @param ctx the parse tree
	 */
	void exitInitialization(GrammarParser.InitializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#initializeKeyword}.
	 * @param ctx the parse tree
	 */
	void enterInitializeKeyword(GrammarParser.InitializeKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#initializeKeyword}.
	 * @param ctx the parse tree
	 */
	void exitInitializeKeyword(GrammarParser.InitializeKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#changeReturnType}.
	 * @param ctx the parse tree
	 */
	void enterChangeReturnType(GrammarParser.ChangeReturnTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#changeReturnType}.
	 * @param ctx the parse tree
	 */
	void exitChangeReturnType(GrammarParser.ChangeReturnTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#changeReturnTypeKeyword}.
	 * @param ctx the parse tree
	 */
	void enterChangeReturnTypeKeyword(GrammarParser.ChangeReturnTypeKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#changeReturnTypeKeyword}.
	 * @param ctx the parse tree
	 */
	void exitChangeReturnTypeKeyword(GrammarParser.ChangeReturnTypeKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#deletion}.
	 * @param ctx the parse tree
	 */
	void enterDeletion(GrammarParser.DeletionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#deletion}.
	 * @param ctx the parse tree
	 */
	void exitDeletion(GrammarParser.DeletionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#deleteKeyword}.
	 * @param ctx the parse tree
	 */
	void enterDeleteKeyword(GrammarParser.DeleteKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#deleteKeyword}.
	 * @param ctx the parse tree
	 */
	void exitDeleteKeyword(GrammarParser.DeleteKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#implementation}.
	 * @param ctx the parse tree
	 */
	void enterImplementation(GrammarParser.ImplementationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#implementation}.
	 * @param ctx the parse tree
	 */
	void exitImplementation(GrammarParser.ImplementationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#extension}.
	 * @param ctx the parse tree
	 */
	void enterExtension(GrammarParser.ExtensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#extension}.
	 * @param ctx the parse tree
	 */
	void exitExtension(GrammarParser.ExtensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void enterAddition(GrammarParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#addition}.
	 * @param ctx the parse tree
	 */
	void exitAddition(GrammarParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#additionKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAdditionKeyword(GrammarParser.AdditionKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#additionKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAdditionKeyword(GrammarParser.AdditionKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#argumentKeyword}.
	 * @param ctx the parse tree
	 */
	void enterArgumentKeyword(GrammarParser.ArgumentKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#argumentKeyword}.
	 * @param ctx the parse tree
	 */
	void exitArgumentKeyword(GrammarParser.ArgumentKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#constructorKeyword}.
	 * @param ctx the parse tree
	 */
	void enterConstructorKeyword(GrammarParser.ConstructorKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#constructorKeyword}.
	 * @param ctx the parse tree
	 */
	void exitConstructorKeyword(GrammarParser.ConstructorKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#parametersKeyword}.
	 * @param ctx the parse tree
	 */
	void enterParametersKeyword(GrammarParser.ParametersKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#parametersKeyword}.
	 * @param ctx the parse tree
	 */
	void exitParametersKeyword(GrammarParser.ParametersKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(GrammarParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAssignKeyword(GrammarParser.AssignKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAssignKeyword(GrammarParser.AssignKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#assignedValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignedValue(GrammarParser.AssignedValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#assignedValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignedValue(GrammarParser.AssignedValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#undo}.
	 * @param ctx the parse tree
	 */
	void enterUndo(GrammarParser.UndoContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#undo}.
	 * @param ctx the parse tree
	 */
	void exitUndo(GrammarParser.UndoContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(GrammarParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(GrammarParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void enterMethodInvocation(GrammarParser.MethodInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodInvocation}.
	 * @param ctx the parse tree
	 */
	void exitMethodInvocation(GrammarParser.MethodInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodNames}.
	 * @param ctx the parse tree
	 */
	void enterMethodNames(GrammarParser.MethodNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodNames}.
	 * @param ctx the parse tree
	 */
	void exitMethodNames(GrammarParser.MethodNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#objectKeyword}.
	 * @param ctx the parse tree
	 */
	void enterObjectKeyword(GrammarParser.ObjectKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#objectKeyword}.
	 * @param ctx the parse tree
	 */
	void exitObjectKeyword(GrammarParser.ObjectKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#cancel}.
	 * @param ctx the parse tree
	 */
	void enterCancel(GrammarParser.CancelContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#cancel}.
	 * @param ctx the parse tree
	 */
	void exitCancel(GrammarParser.CancelContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#freespeech}.
	 * @param ctx the parse tree
	 */
	void enterFreespeech(GrammarParser.FreespeechContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#freespeech}.
	 * @param ctx the parse tree
	 */
	void exitFreespeech(GrammarParser.FreespeechContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#stopfreespeech}.
	 * @param ctx the parse tree
	 */
	void enterStopfreespeech(GrammarParser.StopfreespeechContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#stopfreespeech}.
	 * @param ctx the parse tree
	 */
	void exitStopfreespeech(GrammarParser.StopfreespeechContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#projectKeyword}.
	 * @param ctx the parse tree
	 */
	void enterProjectKeyword(GrammarParser.ProjectKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#projectKeyword}.
	 * @param ctx the parse tree
	 */
	void exitProjectKeyword(GrammarParser.ProjectKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#packageKeyword}.
	 * @param ctx the parse tree
	 */
	void enterPackageKeyword(GrammarParser.PackageKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#packageKeyword}.
	 * @param ctx the parse tree
	 */
	void exitPackageKeyword(GrammarParser.PackageKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#typeKeyword}.
	 * @param ctx the parse tree
	 */
	void enterTypeKeyword(GrammarParser.TypeKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#typeKeyword}.
	 * @param ctx the parse tree
	 */
	void exitTypeKeyword(GrammarParser.TypeKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#classKeyword}.
	 * @param ctx the parse tree
	 */
	void enterClassKeyword(GrammarParser.ClassKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#classKeyword}.
	 * @param ctx the parse tree
	 */
	void exitClassKeyword(GrammarParser.ClassKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#interfaceKeyword}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceKeyword(GrammarParser.InterfaceKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#interfaceKeyword}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceKeyword(GrammarParser.InterfaceKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(GrammarParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void enterVariableType(GrammarParser.VariableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableType}.
	 * @param ctx the parse tree
	 */
	void exitVariableType(GrammarParser.VariableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#methodKeyword}.
	 * @param ctx the parse tree
	 */
	void enterMethodKeyword(GrammarParser.MethodKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#methodKeyword}.
	 * @param ctx the parse tree
	 */
	void exitMethodKeyword(GrammarParser.MethodKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifStatementKeyword}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementKeyword(GrammarParser.IfStatementKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifStatementKeyword}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementKeyword(GrammarParser.IfStatementKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elseStatementKeyword}.
	 * @param ctx the parse tree
	 */
	void enterElseStatementKeyword(GrammarParser.ElseStatementKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elseStatementKeyword}.
	 * @param ctx the parse tree
	 */
	void exitElseStatementKeyword(GrammarParser.ElseStatementKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#whileLoopKeyword}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoopKeyword(GrammarParser.WhileLoopKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#whileLoopKeyword}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoopKeyword(GrammarParser.WhileLoopKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forLoopKeyword}.
	 * @param ctx the parse tree
	 */
	void enterForLoopKeyword(GrammarParser.ForLoopKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forLoopKeyword}.
	 * @param ctx the parse tree
	 */
	void exitForLoopKeyword(GrammarParser.ForLoopKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#charKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCharKeyword(GrammarParser.CharKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#charKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCharKeyword(GrammarParser.CharKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#byteKeyword}.
	 * @param ctx the parse tree
	 */
	void enterByteKeyword(GrammarParser.ByteKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#byteKeyword}.
	 * @param ctx the parse tree
	 */
	void exitByteKeyword(GrammarParser.ByteKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#shortKeyword}.
	 * @param ctx the parse tree
	 */
	void enterShortKeyword(GrammarParser.ShortKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#shortKeyword}.
	 * @param ctx the parse tree
	 */
	void exitShortKeyword(GrammarParser.ShortKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#integerKeyword}.
	 * @param ctx the parse tree
	 */
	void enterIntegerKeyword(GrammarParser.IntegerKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#integerKeyword}.
	 * @param ctx the parse tree
	 */
	void exitIntegerKeyword(GrammarParser.IntegerKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#longKeyword}.
	 * @param ctx the parse tree
	 */
	void enterLongKeyword(GrammarParser.LongKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#longKeyword}.
	 * @param ctx the parse tree
	 */
	void exitLongKeyword(GrammarParser.LongKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#booleanKeyword}.
	 * @param ctx the parse tree
	 */
	void enterBooleanKeyword(GrammarParser.BooleanKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#booleanKeyword}.
	 * @param ctx the parse tree
	 */
	void exitBooleanKeyword(GrammarParser.BooleanKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#doubleKeyword}.
	 * @param ctx the parse tree
	 */
	void enterDoubleKeyword(GrammarParser.DoubleKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#doubleKeyword}.
	 * @param ctx the parse tree
	 */
	void exitDoubleKeyword(GrammarParser.DoubleKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#floatKeyword}.
	 * @param ctx the parse tree
	 */
	void enterFloatKeyword(GrammarParser.FloatKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#floatKeyword}.
	 * @param ctx the parse tree
	 */
	void exitFloatKeyword(GrammarParser.FloatKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#voidKeyword}.
	 * @param ctx the parse tree
	 */
	void enterVoidKeyword(GrammarParser.VoidKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#voidKeyword}.
	 * @param ctx the parse tree
	 */
	void exitVoidKeyword(GrammarParser.VoidKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(GrammarParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(GrammarParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(GrammarParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(GrammarParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessModifier(GrammarParser.AccessModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#accessModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessModifier(GrammarParser.AccessModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void enterStaticKeyword(GrammarParser.StaticKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#staticKeyword}.
	 * @param ctx the parse tree
	 */
	void exitStaticKeyword(GrammarParser.StaticKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#finalKeyword}.
	 * @param ctx the parse tree
	 */
	void enterFinalKeyword(GrammarParser.FinalKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#finalKeyword}.
	 * @param ctx the parse tree
	 */
	void exitFinalKeyword(GrammarParser.FinalKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#abstractKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAbstractKeyword(GrammarParser.AbstractKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#abstractKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAbstractKeyword(GrammarParser.AbstractKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nameKeyword}.
	 * @param ctx the parse tree
	 */
	void enterNameKeyword(GrammarParser.NameKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nameKeyword}.
	 * @param ctx the parse tree
	 */
	void exitNameKeyword(GrammarParser.NameKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#article}.
	 * @param ctx the parse tree
	 */
	void enterArticle(GrammarParser.ArticleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#article}.
	 * @param ctx the parse tree
	 */
	void exitArticle(GrammarParser.ArticleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(GrammarParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(GrammarParser.DotContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#arrayKeyword}.
	 * @param ctx the parse tree
	 */
	void enterArrayKeyword(GrammarParser.ArrayKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#arrayKeyword}.
	 * @param ctx the parse tree
	 */
	void exitArrayKeyword(GrammarParser.ArrayKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#phrase}.
	 * @param ctx the parse tree
	 */
	void enterPhrase(GrammarParser.PhraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#phrase}.
	 * @param ctx the parse tree
	 */
	void exitPhrase(GrammarParser.PhraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(GrammarParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(GrammarParser.NumberContext ctx);
}