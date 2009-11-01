import sun.reflect.Reflection;



public final class JavaDiscovery{
	
	public static isStaticMethod(String className, String methodName, Class<?>.. parameterTypes){
		Class cl = Class.forName(className);
		cl.getDeclaredMethod(methodName, arg1)
	}
	
}