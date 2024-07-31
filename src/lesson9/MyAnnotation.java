package lesson9;

import static java.lang.annotation.ElementType.FIELD;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface MyAnnotation {
	String value();
	int test() default 10;
}
