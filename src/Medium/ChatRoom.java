package Medium;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	private String name;
	public ChatRoom(String name) {
		this.name = name;
	}
	
	List<User> users = new ArrayList<>();
	
	public void connect(User user) {
		this.users.add(user);
		System.out.println("»¶Ó­¡¾"+user.getName()+"¡¿¼ÓÈëÁÄÌìÊÒ¡¾"+this.name+"¡¿");
	}
	
	public void sendMsg(User fromWhom,String msg) {
		users.stream().filter(user->!user.equals(fromWhom)).forEach(toWhom->toWhom.listen(fromWhom, msg));
	}
}
