package at.ooe.fh.mc.codespeech;

public interface Observable {

	public void addObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notify(Object objectOfInterest);
	
}


//@Override
//public void addObserver(Observer observer) {
//	observers.add(observer);
//}
//
//@Override
//public void removeObserver(Observer observer) {
//	observers.remove(observer);
//}
//
//@Override
//public void notify(Object objectOfInterest) {
//	observers.forEach((observer) -> {
//		observer.update(this, objectOfInterest);
//	});
//}