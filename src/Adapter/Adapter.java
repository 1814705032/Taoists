package Adapter;

public class Adapter implements TriplePin {

	private DualPin dualPinDevice;
	
	 //������������ʱ����Ҫ��˫���豸�������
	public Adapter(DualPin dualPinDevice) {
		this.dualPinDevice = dualPinDevice;
	}
	
	//������ʵ�ֵ���Ŀ��ӿ�
	@Override
	public void electrify(int l, int n, int e) {
		//ʵ���ϵ����˱������豸��˫��ͨ�磬����e�������ˡ�
		dualPinDevice.electrify(l, n);
	}

}
