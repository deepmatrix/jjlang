package org.javajavalang.JavaReflection;

import sun.reflect.Reflection;

public class JavaDiscovery {

	public static void isStaticMethod(String className, String methodName, Class<?> parameterTypes)
	{
		try {
			Class cl = Class.forName(className);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//cl.getDeclaredMethod(methodName, arg1);
	}	
}