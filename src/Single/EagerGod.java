package Single;

/**
 *  ����
 */
public class EagerGod {
	private static final EagerGod god = new EagerGod();//�������е�����
	private EagerGod() {}//���췽��˽�л�
	
	public static EagerGod getInstance() {//���񷽷�������
		return god;
	}
}
