package lesson9;

import java.lang.annotation.Annotation;

public class AnnotationTest {
	@MyAnnotation("124")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub
		MyAnnotation	ma = AnnotationTest.class
								.getMethod("main", String[].class)
								.getAnnotation(MyAnnotation.class);
		System.err.println("TEst="+ma.test());
		System.err.println("Value="+ma.value());
	}

}
