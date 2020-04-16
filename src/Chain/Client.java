package Chain;

public class Client {
	public static void main(String[] args) {
		int amount = 10000;
		Staff staff = new Staff("ÕÅ·É");
		if(!staff.approve(amount)) {
			Manager manager = new Manager("¹ØÓğ");
			if(!manager.approve(amount)) {
				CEO ceo = new CEO("Áõ±¸");
				ceo.approve(amount);
			}
			
		}
	}
}
