package TemplateMethod;

public abstract class Mammal {
	private boolean female;
	public Mammal(boolean female) {
		this.female = female;
	}
	protected final void feedMilk() {
		if(female) {
			System.out.println("喂奶");
		}else {
			System.out.println("公的不会");
		}
	}
	
	public abstract void move();
	
}
