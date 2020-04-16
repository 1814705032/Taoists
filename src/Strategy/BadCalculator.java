package Strategy;

public class BadCalculator {//违反设计模式原则的计算器
	
	public int add(int a,int b) {//加法
		return a+b;
	}
	
	public int sub(int a,int b) {//减法
		return a-b;
	}
}
