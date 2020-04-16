package Prototype;

public class EnemyPlane implements Cloneable {
	private int x;//������
	private int y=0;//������
	
	private Bullet bullet;
	
	public EnemyPlane(int x,Bullet bullet) {
		this.x = x;
		this.bullet = bullet;
	}
	
	public void fly() {
		y++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}
	
	public void setBullet(Bullet bullet) {
		this.bullet = bullet;
	}
	
	public Bullet getBullet() {
		return bullet;
	}
	
	@Override
	protected EnemyPlane clone() throws CloneNotSupportedException {
		EnemyPlane clonePlane = (EnemyPlane) super.clone();
		clonePlane.setBullet(this.bullet.clone());//���ӵ��������¡
		return clonePlane;
	}

	
	
}
