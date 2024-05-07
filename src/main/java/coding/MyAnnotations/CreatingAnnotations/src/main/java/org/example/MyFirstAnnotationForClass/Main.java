package org.example.MyFirstAnnotationForClass;

import org.example.MyFirstAnnotationForClass.FoodItems;

public class Main {
    public static void main(String[] args) {
        FoodItems foodItems =new FoodItems();
        if(foodItems.getClass().isAnnotationPresent(MyFirstAnnotationForClass.class)){
            System.out.println("MyFirstAnnotationForClass is present!");
        }else {
            System.out.println("MyFirstAnnotationForClass is not present!");
        }
    }

}