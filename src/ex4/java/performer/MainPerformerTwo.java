package ex4.java.performer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerformerTwo {

    public static void main(String[] args) {

        //контейнер
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ex4/resources/spring_annotation.xml");

        System.out.println("\n========                 ======\n");


       Performer performer = (Performer) ctx.getBean("benny");
        performer.perform();



    }

}
