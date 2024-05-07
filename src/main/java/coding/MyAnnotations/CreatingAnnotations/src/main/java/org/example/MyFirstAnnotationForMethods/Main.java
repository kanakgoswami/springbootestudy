package org.example.MyFirstAnnotationForMethods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method =  FoodItems.class.getMethod("Quantity");
        MyFirstAnnotationForMethod myFirstAnnotationForMethod = method.getAnnotation(MyFirstAnnotationForMethod.class);
        String value = myFirstAnnotationForMethod.value();
        int count = myFirstAnnotationForMethod.count();

        System.out.println("Value: " + value);
        System.out.println("Count: " + count);
    }
}