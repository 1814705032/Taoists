package proxy;

public class Client {
	public static void main(String[] args) {
		//静态代理
//		UserManager userManager = new UserManagerImplProxy(new UserManagerImpl());
//		userManager.addUser("1", "张三");
		
		LogHandler logHandler = new LogHandler();
		UserManager userManger = (UserManager) logHandler.newProxyInstance(new UserManagerImpl());
		userManger.addUser("11", "李四");
	}
}
