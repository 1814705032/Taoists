package Chain2;

public class Client {
	public static void main(String[] args) {
		 Approver flightJohn = new Staff("�ŷ�");
		 flightJohn.setNextApprover(new Manager("����")).setNextApprover(new CEO("����"));
//		 flightJohn.approver(1000);
//		 flightJohn.approver(4000);
//		 flightJohn.approver(9000);
		 flightJohn.approver(88000);
	}
}
