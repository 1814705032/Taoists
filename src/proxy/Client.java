package proxy;

public class Client {
	public static void main(String[] args) {
		//��̬����
//		UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
//		userManager.addUser("1", "����");
		
		LogHandler logHandler = new LogHandler();
		UserManager userManger = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
		userManger.addUser("11", "����");
	}
}
