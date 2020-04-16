package TemplateMethod;

public class Human extends Mammal{
	public Human(boolean female) {
		super(female);
	}

	@Override
	public void move() {
		System.out.println("两条腿走路……");
	}

}
