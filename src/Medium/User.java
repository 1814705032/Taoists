package Medium;

public class User {
	private String name;
	private ChatRoom chatRoom;
	
	public User(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void login(ChatRoom chatRoom) {//用户登陆
		chatRoom.connect(this);//调用聊天室连接方法
		this.chatRoom = chatRoom;//注入聊天室引用
	}
	
	public void talk(String msg) {//用户发言
		chatRoom.sendMsg(this, msg);//给聊天室发消息
	}
	
	public void listen(User fromWhom,String msg) {
		System.out.print("【"+this.name+"的对话框】");
		System.out.println(fromWhom.getName()+"说："+msg);
	}
	
	public boolean equals(String name) {
		if(this.name.equals(name)) {
			return true;
		}else {
			return false;
		}
	}
}
