package TemplateMethod;

public abstract class Mammal {
	private boolean female;
	public Mammal(boolean female) {
		this.female = female;
	}
	protected final void feedMilk() {
		if(female) {
			System.out.println("ι��");
		}else {
			System.out.println("���Ĳ���");
		}
	}
	
	public abstract void move();
	
}
