package State;

public class Off implements State {

	@Override
	public void switchOn(Switcher switcher) {
		switcher.setState(new On());
		 System.out.println("OK...����");
	}

	@Override
	public void switchOff(Switcher switcher) {
		System.out.println("WARN!!!�ϵ�״̬�����ٹ�");
		return;
	}

}
