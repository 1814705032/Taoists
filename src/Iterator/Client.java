package Iterator;

public class Client {
	public static void main(String[] args) {
		DrivingRecorder dr= new DrivingRecorder();
		for(int i=0;i<12;i++) {
			dr.append("สำฦต_"+i);
		}
		dr.display();
		dr.displayInOrder();
	}
	
}
