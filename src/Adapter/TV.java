package Adapter;

public class TV implements DualPin {

	@Override
	public void electrify(int l, int n) {
		System.out.println("����ͨ�磺" + l);
        System.out.println("����ͨ�磺" + n);
	}

}
