package Chain;

public class Client {
	public static void main(String[] args) {
		int amount = 10000;
		Staff staff = new Staff("�ŷ�");
		if(!staff.approve(amount)) {
			Manager manager = new Manager("����");
			if(!manager.approve(amount)) {
				CEO ceo = new CEO("����");
				ceo.approve(amount);
			}
			
		}
	}
}
