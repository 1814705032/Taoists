package Medium;

public class Main {
	public static void main(String[] args) {
		People p3 = new People("����");
		People p4 = new People("����");
		
		p3.connect(p4);
		p4.connect(p3);
		
		p3.talk("���");
		p4.talk("��ã�����");
	}
}
