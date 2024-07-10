package lesson7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class REflectionTEst {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		test("vassya");
	}

	static void test(final Object obj) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		final Class	cl = obj.getClass();
		
//		System.err.println("Name: "+cl.getCanonicalName());
//		System.err.println("Name: "+cl.getName());
//		System.err.println("Simple name: "+cl.getSimpleName());
//		System.err.println("Package: "+cl.getPackage());
//		System.err.println("Modifiers: "+cl.getModifiers());
//		
//		System.err.println("is public ? "+Modifier.isPublic(cl.getModifiers()));
//		System.err.println("is final ? "+Modifier.isFinal(cl.getModifiers()));
//		System.err.println("is abstract ? "+Modifier.isAbstract(cl.getModifiers()));
//		
//		System.err.println("Parent: "+cl.getSuperclass());
//		System.err.println("INterfaces: "+Arrays.toString(cl.getInterfaces()));
//			
//		System.err.println("Fields: "+Arrays.toString(cl.getFields()));
//		System.err.println("Fields(2): "+Arrays.toString(cl.getDeclaredFields()));
//		
//		Field	f = cl.getDeclaredField("value");
//		
//		System.err.println("Type: "+f.getType());
//		f.setAccessible(true);
//		System.err.println("Value: "+Arrays.toString((char[])f.get(obj)));
//		
////		f.set(obj, new char[] {'a','b','c','d'});
////		
////		System.err.println("Obj: "+obj);
//		System.err.println("''''''");
//		Method[] m = cl.getMethods();
//		for(Method item : m) {
//			System.err.println("MEthod: "+item);
//		}
		Method mm = cl.getMethod("substring", int.class, int.class);
		System.err.println("Name: "+mm.getName());
		System.err.println("Parameters: "+Arrays.toString(mm.getParameters()));
		System.err.println("Returned: "+mm.getReturnType());
		
		System.err.println("CALL: "+mm.invoke(obj, 2, 5));
	
		for(Constructor item : cl.getConstructors()) {
			System.err.println("COn: "+item);
		}
		Constructor	c = cl.getConstructor(char[].class);
		String	str = (String)c.newInstance(new char[] {'a','b','c','d','e'});
		
		System.err.println("Str: "+str);
		
//		cl.cast("aaaa")
//		(String)"aaaa"

//		cl.isInstance(Object.class)
//		obj instanceof Object
		
//		cl.isAssignableFrom("vassya".getClass())->cl.isInstance(String.class)

	}
}
