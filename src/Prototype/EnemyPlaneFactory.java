package Prototype;

public class EnemyPlaneFactory {
	
	private static final EnemyPlane prototype = new EnemyPlane(200,new Bullet());
	
	public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
		EnemyPlane clone = prototype.clone();
		clone.setX(x);
		return clone;
	}
}
