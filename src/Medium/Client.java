package Medium;

public class Client {
	public static void main(String[] args) {
		User user1 = new User("С��");
		User user2 = new User("С��");
		ChatRoom chatRoom = new  ChatRoom("����Ⱥ1");
		user1.login(chatRoom);
		user2.login(chatRoom);
		user1.talk("���");
		user2.talk("hello");
	}
}
