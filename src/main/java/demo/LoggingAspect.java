package demo;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* demo.ShoppingCart.checkOut())")
    public void beforeLogger(){
        System.out.println("                      *************************");
        System.out.println("this is a logger method that i want to call before checkout method");
    }
    @After("execution(* demo.ShoppingCart.checkOut())")
    public void aftereLogger(){
        System.out.println("                      *************************");
        System.out.println("this is a logger method that i want to call After checkout method");
    }


}
