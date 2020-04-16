package Decorate;


public abstract class Decorator implements Showable{//�ٳ������ױƷ�Ĺ���

	protected Showable showable;
	
	public Decorator(Showable showable) {
		this.showable = showable;
	}
	
	@Override
	public void show() {
		showable.show();//ֱ�ӵ��ò������κη��Ρ�
	}

}
