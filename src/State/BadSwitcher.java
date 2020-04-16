package State;

public class BadSwitcher {
	boolean state  = false;
	
	public void switchOn() {
		if(state == false) {
			state = true;
			 System.out.println("OK...灯亮");
		}else {
			 System.out.println("WARN!!!通电状态无需再开");
		}
	} 
	
	public void switchOff() {
		if(state==true) {
			state = false;
			System.out.println("OK...灯灭");
		}else {
			 System.out.println("WARN!!!断电状态无需再关");
		}
	}
}
