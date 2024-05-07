package org.example.MyFirstAnnotationForMethods;


public class FoodItems {
    String rice;
    String daal;
    int quantity;

    public FoodItems(String rice) {
        this.rice = rice;
    }

    public void testOfPlainRice( ){
        System.out.println("plainRice"+rice);
    }

    public void testOfPlainDaal( ){
        System.out.println("daal"+daal);
    }

    @MyFirstAnnotationForMethod(value = "Hello", count = 9)
    public void Quantity( ){
        System.out.println("quantity"+quantity);
    }

}
