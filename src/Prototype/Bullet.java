package Prototype;

public class Bullet implements Cloneable{
	//ʡ���ӵ�������
	
	@Override
	protected Bullet clone() throws CloneNotSupportedException {
		return (Bullet)super.clone();
	}
}
