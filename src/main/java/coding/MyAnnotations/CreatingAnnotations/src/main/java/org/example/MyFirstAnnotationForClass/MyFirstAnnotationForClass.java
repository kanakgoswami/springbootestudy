package org.example.MyFirstAnnotationForClass;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


//@Target(ElementType.TYPE)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public  @interface MyFirstAnnotationForClass {

}
