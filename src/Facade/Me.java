package Facade;

public class Me {
	public void cook() {
		System.out.println("我烹饪。。。");
	}
	
	public static void main(String[] args) {
		VegVendor vv = new VegVendor();
		vv.sell();
		Me me = new Me();
		me.cook();
		GirlFriend gf = new  GirlFriend();
		gf.eat();
		 //谁洗碗呢？一场战场一触即发……
	}
}
