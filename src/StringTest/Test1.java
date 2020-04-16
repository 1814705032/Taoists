package StringTest;

public class Test1 {
	public static void main(String[] args) {
		String x =  new String("ab");
		change(x);
		System.out.println(x);
	}
	
	public static void change(String xx) {
		xx = "cd";
	}
}
