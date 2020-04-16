package Decorate;

public class FoundationMakeup extends Decorator{

	public FoundationMakeup(Showable showable) {
		super(showable);
	}

	@Override
	public void show() {
		System.out.print("��۵�(");
		showable.show();
		System.out.print(")");
	}
}
