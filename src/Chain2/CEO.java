package Chain2;

public class CEO extends Approver{

	public CEO(String name) {
		super(name);
	}

	@Override
	public void approver(int amount) {
		if(amount <= 10000) {
			System.out.println("����ͨ������CEO��" + name + "��");
		}else {
			System.out.println("�������롣��CEO��" + name + "��");
		}
		
	}

}
