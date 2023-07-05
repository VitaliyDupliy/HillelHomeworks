package ua.hillel.hw19;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.PriorityQueue;


public class TestRunner {
	
	static void start (Class<?> objekt) throws IllegalAccessException, IllegalArgumentException, ReflectiveOperationException {
		
	
		
		Annotation[] beforeSuiteMethods = objekt.getDeclaredAnnotationsByType(BeforeSuite.class);
		if (beforeSuiteMethods.length > 1) {
			throw new NoSuchMethodException("There should be only one method with @BeforeSuite");
		}
		
		
		Annotation[] afterSuiteMethods = objekt.getDeclaredAnnotationsByType(AfterSuite.class);
		if (afterSuiteMethods.length > 1) {
			throw new NoSuchMethodException("There should be only one method with @AfterSuite ");
		}
		
		Method[] methods = objekt.getDeclaredMethods(); 
		
		PriorityQueue<Method> testMethods = new PriorityQueue<>(new Comparator<Method>() {

			@Override
			public int compare(Method m1, Method m2) {
				
				
				return m1.getDeclaredAnnotation(Test.class).priority() - m2.getDeclaredAnnotation(Test.class).priority();
			}
			
		});
		
		
		for (Method method: methods) {
			
			if(method.isAnnotationPresent(BeforeSuite.class)) {
				method.invoke(objekt.newInstance());
			}
			
						
			if(method.isAnnotationPresent(Test.class)) {
			testMethods.add(method);
			}
			
			while(!testMethods.isEmpty()) {
				testMethods.poll().invoke(objekt.newInstance());
			}
				
				
			
			if(method.isAnnotationPresent(AfterSuite.class)) {
				method.invoke(objekt.newInstance());
			}
			
		}
		
	
		}
	

}
