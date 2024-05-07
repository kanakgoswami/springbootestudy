package org.example.MyFirstAnnotationForMethods;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public  @interface MyFirstAnnotationForMethod {
    String value();
    int count() default 1;
}
