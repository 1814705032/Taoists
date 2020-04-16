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
	
	public void login(ChatRoom chatRoom) {//�û���½
		chatRoom.connect(this);//�������������ӷ���
		this.chatRoom = chatRoom;//ע������������
	}
	
	public void talk(String msg) {//�û�����
		chatRoom.sendMsg(this, msg);//�������ҷ���Ϣ
	}
	
	public void listen(User fromWhom,String msg) {
		System.out.print("��"+this.name+"�ĶԻ���");
		System.out.println(fromWhom.getName()+"˵��"+msg);
	}
	
	public boolean equals(String name) {
		if(this.name.equals(name)) {
			return true;
		}else {
			return false;
		}
	}
}
