package State;

public class BadSwitcher {
	boolean state  = false;
	
	public void switchOn() {
		if(state == false) {
			state = true;
			 System.out.println("OK...����");
		}else {
			 System.out.println("WARN!!!ͨ��״̬�����ٿ�");
		}
	} 
	
	public void switchOff() {
		if(state==true) {
			state = false;
			System.out.println("OK...����");
		}else {
			 System.out.println("WARN!!!�ϵ�״̬�����ٹ�");
		}
	}
}
