package Chain;

public class Staff {
	private String name;
	
	public Staff(String name) {
		this.name = name;
	}
	
	public boolean approve(int amount) {
		if(amount <= 1000) {
			System.out.println("����ͨ������Ա����" + name + "��");
			return true;
		}else {
			System.out.println("��Ȩ�����������ϼ�����Ա����" + name + "��");
			return false;	
		}
	}
	
}
