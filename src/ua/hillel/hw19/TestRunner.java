package ua.hillel.hw19;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestRunner {

	static void start(Class<?> objekt)
			throws IllegalAccessException, IllegalArgumentException, ReflectiveOperationException {

		Annotation[] beforeSuiteMethods = objekt.getDeclaredAnnotations();
		if (beforeSuiteMethods.length > 1) {
			throw new NoSuchMethodException("There should be only one method with @BeforeSuite");
		}

		Method[] methods = objekt.getDeclaredMethods();

		PriorityQueue<Method> testMethods = new PriorityQueue<>(new Comparator<Method>() {

			@Override
			public int compare(Method m1, Method m2) {

				return m1.getDeclaredAnnotation(Test.class).priority()
						- m2.getDeclaredAnnotation(Test.class).priority();
			}

		});

		int countBefore = 0;
		for (Method method : methods) {

			if (method.isAnnotationPresent(BeforeSuite.class)) {
				method.invoke(objekt.newInstance());
				countBefore++;
			}
			if (countBefore > 1) {
				throw new NoSuchMethodException("There should be only one method with @BeforeSuite ");
			}
		}

		for (Method method : methods) {
			if (method.isAnnotationPresent(Test.class)) {
				testMethods.add(method);
			}
		}



		while (!testMethods.isEmpty()) {
			testMethods.poll().invoke(objekt.newInstance());
		}

		int countAfter = 0;
		for (Method method : methods) {

			if (method.isAnnotationPresent(AfterSuite.class)) {
				method.invoke(objekt.newInstance());
				countAfter++;
			}
			if (countAfter > 1) {
				throw new NoSuchMethodException("There should be only one method with @AfterSuite ");
			}
		}

	}

}
