package Chain;

public class Manager {
	private String name;
	
	public Manager(String name) {
		this.name = name;
	}
	
	public boolean approve(int amount) {
		if(amount <= 5000) {
			System.out.println("����ͨ����������" + name + "��");
			return true;
		}else {
			System.out.println("��Ȩ�����������ϼ���������" + name + "��");
			return false;	
		}
	}
	
}
