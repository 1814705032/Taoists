package Strategy;

public class Client {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setStrategy(new Addition());
		int result = calculator.getResult(1, 1);
		System.out.println(result);
		
		calculator.setStrategy(new Subtraction());
		int result2 = calculator.getResult(1, 1);
		System.out.println(result2);
	}
}
