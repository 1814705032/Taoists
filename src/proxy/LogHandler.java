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
	//动态代理类只能代理接口（不支持抽象类），代理类都需要实现InvocationHandler类，实现invoke方法。
	//该invoke方法就是调用被代理接口的所有方法时需要调用的，该invoke方法返回的值是被代理接口的一个实现类 
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 System.out.println("start-->>");  
	        for(int i=0;i<args.length;i++){  
	            System.out.println(args[i]);  
	        }  
	        Object ret=null;  
	        try{  
	            /*原对象方法调用前处理日志信息*/  
	            System.out.println("satrt-->>");  
	              
	            //调用目标方法  
	            ret=method.invoke(targetObject, args);  
	            /*原对象方法调用后处理日志信息*/  
	            System.out.println("success-->>");  
	        }catch(Exception e){  
	            e.printStackTrace();  
	            System.out.println("error-->>");  
	            throw e;  
	        }  
	        return ret;  
	}

}
