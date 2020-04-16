package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LogHandler implements InvocationHandler{
	
	private Object targetObject;
	
	public Object newProxyInstance(Object targetObject) {
		this.targetObject = targetObject;
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), 
				targetObject.getClass().getInterfaces(), this);
	}
	//��̬������ֻ�ܴ���ӿڣ���֧�ֳ����ࣩ�������඼��Ҫʵ��InvocationHandler�࣬ʵ��invoke������
	//��invoke�������ǵ��ñ�����ӿڵ����з���ʱ��Ҫ���õģ���invoke�������ص�ֵ�Ǳ�����ӿڵ�һ��ʵ���� 
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 System.out.println("start-->>");  
	        for(int i=0;i<args.length;i++){  
	            System.out.println(args[i]);  
	        }  
	        Object ret=null;  
	        try{  
	            /*ԭ���󷽷�����ǰ������־��Ϣ*/  
	            System.out.println("satrt-->>");  
	              
	            //����Ŀ�귽��  
	            ret=method.invoke(targetObject, args);  
	            /*ԭ���󷽷����ú�����־��Ϣ*/  
	            System.out.println("success-->>");  
	        }catch(Exception e){  
	            e.printStackTrace();  
	            System.out.println("error-->>");  
	            throw e;  
	        }  
	        return ret;  
	}

}
