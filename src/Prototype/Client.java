package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		List<EnemyPlane> enemyPlanes = new ArrayList<>();
		for(int i=0;i<50;i++) {
			EnemyPlane ep = EnemyPlaneFactory.getInstance(i);
			enemyPlanes.add(ep);
			System.out.println(enemyPlanes.get(i)+"-----"+enemyPlanes.get(i).getBullet());
		}
	}
}
