package Chain2;

public class Manager extends Approver{

	public Manager(String name) {
		super(name);
	}

	@Override
	public void approver(int amount) {
		if(amount <= 5000) {
			System.out.println("����ͨ����������" + name + "��");
		}else {
			System.out.println("��Ȩ�����������ϼ���������" + name + "��");
			this.nextApprover.approver(amount);
		}
		
	}

}
