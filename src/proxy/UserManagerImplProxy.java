package proxy;

public class UserManagerImplProxy implements UserManager{
	
	private UserManager userManager;
	
	public UserManagerImplProxy(UserManager userManager) {
		this.userManager = userManager;
	}
	
	@Override
	public void addUser(String userId, String userName) {
		try{  
            //��Ӵ�ӡ��־�Ĺ���  
            //��ʼ����û�  
            System.out.println("start-->addUser()");  
            userManager.addUser(userId, userName);  
            //����û��ɹ�  
            System.out.println("success-->addUser()");  
        }catch(Exception e){  
            //����û�ʧ��  
            System.out.println("error-->addUser()");  
        }  
	}

	@Override
	public void delUser(String userId) {
		userManager.delUser(userId);
		
	}

	@Override
	public String findUser(String userId) {
		
		return userManager.findUser(userId);
	}

	@Override
	public void modifyUser(String userId, String userName) {
		userManager.modifyUser(userId, userName);
		
	}

}
