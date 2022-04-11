package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkOut(){
        //all 3 are cross cutting concerns and to avoid these concerns we create different aspect
        //so that applications main logic will be separate from these code.
        //logging
        //Authentication
        //sanitize data
        System.out.println("Check out method for shopping cart");
    }
}
