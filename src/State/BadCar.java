package State;

public class BadCar {
	 //0��Parkפ������1��Reverse���˵���
	 //2��Neutral�յ���3��Driveǰ������
	String state = "P";//��ʼ״̬��P��
	
	public void push() {//�����Ƶ���
		switch(state) {
			case "P":
				System.out.println("WARN!!!��ͷ���Ʋ����ˣ�");
			break;
			case "R":
				state = "P";
				System.out.println("OK...��P��");
			break;
			case "N"://�յ�״̬
				System.out.println("OK...��R��");
			break;
			case "D"://ǰ����״̬
				 System.out.println("OK...��N��");
			break;
			default:
			break;
		}
	}
	
	public void pull(){//����������
		       //����ʡ�ԣ��߼�ͬ������
   }
}
