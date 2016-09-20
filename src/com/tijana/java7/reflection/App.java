package com.tijana.java7.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 
 * @author ttinana
 * 
 *         Reflection is a language's ability to inspect and dynamically call
 *         classes, methods, attributes, etc. at runtime.
 * 
 *         Reflection is a language's ability to inspect and dynamically call
 *         classes, methods, attributes, etc. at runtime.
 * 
 *         For example, all objects in Java have the method getClass(), which
 *         lets you determine the object's class even if you don't know it at
 *         compile time (e.g. if you declared it as an Object) - this might seem
 *         trivial, but such reflection is not possible in less dynamic
 *         languages such as C++. More advanced uses lets you list and call
 *         methods, constructors, etc.
 * 
 *         Reflection is important since it lets you write programs that do not
 *         have to "know" everything at compile time, making them more dynamic,
 *         since they can be tied together at runtime. The code can be written
 *         against known interfaces, but the actual classes to be used can be
 *         instantiated using reflection from configuration files.
 *
 */
public class App {

	public App() {

	}

	public static void main(String[] args) {
		Method method;
		try {
			Foo foo = new Foo();
			method = foo.getClass().getMethod("doSomething", null);
			method.invoke(foo, null);
		} catch (SecurityException | ReflectiveOperationException | IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
