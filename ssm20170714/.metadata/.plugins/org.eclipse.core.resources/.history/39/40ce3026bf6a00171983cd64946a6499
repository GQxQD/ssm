package cn.gqxqd.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyAspect implements MethodInterceptor {

	public Object invoke(MethodInvocation methodi) throws Throwable {
		System.out.println("before procees");
		// 执行方法的时候proceed
		Object obj = methodi.proceed();

		System.out.println("after procees");

		return obj;
	}

}
