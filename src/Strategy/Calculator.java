package Strategy;

public class Calculator {
	private Strategy strategy;//ӵ��ĳ���㷨����
	
	public void setStrategy(Strategy strategy) {//�����㷨����
		this.strategy  = strategy;
	}
	
	public int getResult(int a,int b) {
		return this.strategy.calculate(a, b);//���ؾ�����ԵĽ��
	}
}
