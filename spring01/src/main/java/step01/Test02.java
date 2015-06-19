package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test02 {
  public static void main(String[] args) {
    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("step01/application-context02.xml");
    
    Car c1 = (Car)ctx.getBean("c1");
    
    Car c2 = (Car)ctx.getBean("c2");
    Car c3 = (Car)ctx.getBean("c3");

    if (c2 == c3) { System.out.println("c2 == c3");}
    
    Car c4 = (Car)ctx.getBean("c4");
    Car c5 = (Car)ctx.getBean("c5");
    Car c6 = (Car)ctx.getBean("c6");
    
    if (c4 == c5) { System.out.println("c4 == c5");}
    if (c4 == c6) { System.out.println("c4 == c6");}
   
  }

}
