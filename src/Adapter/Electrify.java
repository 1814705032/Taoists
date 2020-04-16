package Adapter;

public class Electrify {
	public static void main(String[] args) {
		TV tv = new TV();
		Adapter adapter = new Adapter(tv);
		adapter.electrify(1, 1, 1);
	}
}
