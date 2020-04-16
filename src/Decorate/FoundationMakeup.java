package Decorate;

public class FoundationMakeup extends Decorator{

	public FoundationMakeup(Showable showable) {
		super(showable);
	}

	@Override
	public void show() {
		System.out.print("´ò·Ûµ×(");
		showable.show();
		System.out.print(")");
	}
}
