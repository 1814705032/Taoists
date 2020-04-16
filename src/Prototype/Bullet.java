package Prototype;

public class Bullet implements Cloneable{
	//省略子弹的属性
	
	@Override
	protected Bullet clone() throws CloneNotSupportedException {
		return (Bullet)super.clone();
	}
}
