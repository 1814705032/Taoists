package Single;
/**
 *  懒神
 */
public class LazyGod {
	private static LazyGod god;//这里不进行实例化
	private LazyGod() {}
	
	public static LazyGod getInstance() { //庙是开放的不用排队进入
		if(god==null) { //如果头柱香未产生，这批抢香人进入堂内排队
			synchronized (LazyGod.class) {
				if(god==null) { //只有头香造了神，其他抢香的白排队了
					god = new LazyGod();
				}
			}
		}
		return god;
	} 
}
