package Decorate;


public abstract class Decorator implements Showable{//再抽象出化妆品的共性

	protected Showable showable;
	
	public Decorator(Showable showable) {
		this.showable = showable;
	}
	
	@Override
	public void show() {
		showable.show();//直接调用不做加任何粉饰。
	}

}
