package State;

public class On implements State{

	@Override
	public void switchOn(Switcher switcher) {
		 System.out.println("WARN!!!ͨ��״̬�����ٿ�");
		 return;
	}

	@Override
	public void switchOff(Switcher switcher) {
		switcher.setState(new Off());
		System.out.println("OK...����");
	}

}
