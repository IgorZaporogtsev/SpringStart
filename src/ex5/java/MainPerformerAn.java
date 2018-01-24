package ex5.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerformerAn {

    public static void main(String[] args) {

        //контейнер
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ex5/resources/java_annotation.xml");

        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();



    }

}
