package Chain2;

public class Staff extends Approver{

	public Staff(String name) {
		super(name);
	}

	@Override
	public void approver(int amount) {
		if(amount <= 1000) {
			System.out.println("����ͨ������Ա����" + name + "��");
		}else {
			System.out.println("��Ȩ�����������ϼ�����Ա����" + name + "��");
			this.nextApprover.approver(amount);
		}
		
	}

}
