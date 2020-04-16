package Single;

/**
 *  饿神
 */
public class EagerGod {
	private static final EagerGod god = new EagerGod();//自有永有的神单例
	private EagerGod() {}//构造方法私有化
	
	public static EagerGod getInstance() {//请神方法公开化
		return god;
	}
}
