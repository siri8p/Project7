package com.example.Project7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/Project7/config.xml");
               Car c  = (Car)context.getBean("car");
              c.drive();
        
//                  Tire t =  (Tire) context.getBean("tire");
//                System.out.println(t);
//                //  System.out.println(t.getBrand());
    }
}
