package TemplateMethod;

public class Whale extends Mammal{

	public Whale(boolean female) {
		super(female);
	}

	@Override
	public void move() {
		System.out.println("снс╬.....");
	}

}
