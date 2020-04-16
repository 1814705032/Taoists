package Iterator;

public class DrivingRecorder {
	private int index = -1;
	private String[] records = new String[10];
	
	public void append(String record) {
		if(index == 9) {
			index=0;
		}else {
			index++;
		}
		records[index]=record;
	}
	
	public void display() {
		for (int i = 0; i < records.length; i++) {
			System.out.println(i+": "+records[i]);
		}
	}
	
	 public void displayInOrder() {//按顺序从新到旧显示10条记录
		        for (int i = index, loopCount = 0; loopCount < 10; i = i == 0 ? i = 9 : i - 1, loopCount++) {
		           System.out.println(records[i]);
		       }
	   }
}
