package TemplateMethod;

public class CigarLighter implements CigarLighterInterface {
	//��������ʵ��
	@Override
	public void electrifyDC16V() {
		int time = 1000;
		while (--time>0) {
			System.out.println("���ȵ�¯˿");
		}
		System.out.println("����������");
	}

}
