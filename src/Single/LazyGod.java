package Single;
/**
 *  ����
 */
public class LazyGod {
	private static LazyGod god;//���ﲻ����ʵ����
	private LazyGod() {}
	
	public static LazyGod getInstance() { //���ǿ��ŵĲ����Ŷӽ���
		if(god==null) { //���ͷ����δ���������������˽��������Ŷ�
			synchronized (LazyGod.class) {
				if(god==null) { //ֻ��ͷ����������������İ��Ŷ���
					god = new LazyGod();
				}
			}
		}
		return god;
	} 
}
