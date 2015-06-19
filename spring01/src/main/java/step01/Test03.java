package step01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
  public static void main(String[] args) {
    ApplicationContext ctx =
        new ClassPathXmlApplicationContext("step01/application-context03.xml");
    
    Car c1 = (Car)ctx.getBean("step01.Car#0");
    
    Car c2 = (Car)ctx.getBean("step01.Car");
    if (c1 == c2) System.out.println("c1 == c2");
    
    //Car car = (Car)ctx.getAliases("Car"); // 오류!!
    
    Car carX = (Car)ctx.getBean("step01.Car#1");
    Car carY = (Car)ctx.getBean("step01.Car#2");
    
  }

}
