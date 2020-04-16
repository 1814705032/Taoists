package Medium;

public class Client {
	public static void main(String[] args) {
		User user1 = new User("小明");
		User user2 = new User("小红");
		ChatRoom chatRoom = new  ChatRoom("聊天群1");
		user1.login(chatRoom);
		user2.login(chatRoom);
		user1.talk("你好");
		user2.talk("hello");
	}
}
