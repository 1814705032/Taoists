package Chain;

public class CEO {
	private String name;
	public CEO(String name) {
		this.name = name;
	}
	public boolean approve(int amount) {
		if(amount <= 10000) {
			System.out.println("����ͨ������CEO��" + name + "��");
			return true;
		}else {
			System.out.println("��Ȩ�����������ϼ�����CEO��" + name + "��");
			return false;	
		}
	}
}
