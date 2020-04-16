package Decorate;

public class Client {
	public static void main(String[] args) {
		Showable makeupGirl = new Lipstick(new FoundationMakeup(new Girl())) ;
		makeupGirl.show();
	}
}
