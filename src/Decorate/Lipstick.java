package Decorate;

public class Lipstick extends Decorator{

	public Lipstick(Showable Showable) {
		super(Showable);
	}
	
	@Override
	public void show() {
		System.out.print("Ϳ�ں�(");
	    showable.show();
		System.out.print(")");
	}

}
