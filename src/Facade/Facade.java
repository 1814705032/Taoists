package Facade;

public class Facade {
	private VegVendor vv;
	private Chef chef;
	private Waiter waiter;
	private Cleaner cleaner;
	
	public Facade() {
		this.vv = new VegVendor();
		 //����ǰ���Ҳ˷���׼�����߲�
		vv.sell();
		//��Ȼ���ù�Ӷ�ø��෹�������Ա
		this.chef = new Chef();
		this.waiter = new Waiter();
		this.cleaner = new Cleaner();
	}
	
	public void provideService() {
		//�Ӵ������������
		waiter.order();
		//��ʦ����
		chef.cook();
		//�ϲ�
		waiter.serve();
		 //��ʰ���ӣ�ϴ�룬�Լ��������򡭡�
		cleaner.clean();
		cleaner.wash();
	}
}
