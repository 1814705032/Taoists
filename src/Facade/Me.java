package Facade;

public class Me {
	public void cook() {
		System.out.println("����⿡�����");
	}
	
	public static void main(String[] args) {
		VegVendor vv = new VegVendor();
		vv.sell();
		Me me = new Me();
		me.cook();
		GirlFriend gf = new  GirlFriend();
		gf.eat();
		 //˭ϴ���أ�һ��ս��һ����������
	}
}
