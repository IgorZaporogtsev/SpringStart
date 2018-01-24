package ex3.java.performer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerformer {

    public static void main(String[] args) {

        //контейнер
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ex3/resources/spring-idol.xml");
/*
        System.out.println("\n============== Duke juggler ==============\n");

        Performer performer_3 = (Performer) ctx.getBean("duke");
        performer_3.perform();
*/


        System.out.println("\n============== Duke poetic juggler =======\n");

        Performer performer_1 = (Performer) ctx.getBean("poeticDuke");
        performer_1.perform();
/*
        System.out.println("\n============== Kenny instrumentalist =====\n");

        Performer performer_2 = (Performer) ctx.getBean("kenny");
        performer_2.perform();

        System.out.println("\n============== Hank OneManBandList =====\n");

        Performer performer_4 = (Performer) ctx.getBean("hank");
        performer_4.perform();

        System.out.println("\n============== Hank OneManBandMap ======\n");

        Performer performer_5 = (Performer) ctx.getBean("hank_2");
        performer_5.perform();

        System.out.println("\n===============Hank OneManBandProperties========\n");

        Performer performer_6 = (Performer) ctx.getBean("hank_3");
        performer_6.perform();


        System.out.println("\n========== Абстрактные компоненты ======\n");

        System.out.println("==kenny_2==\n");
        Performer performer_7 = (Performer) ctx.getBean("kenny_2");
        performer_7.perform();

        System.out.println("\n==david==\n");
        Performer performer_9 = (Performer) ctx.getBean("david");
        performer_9.perform();


        System.out.println("\n======== Переопределение наследуемых свойств ======\n");

        System.out.println("==frank==\n");
        Performer performer_10 = (Performer) ctx.getBean("frank");
        performer_10.perform();


        System.out.println("\n======== Общие абстрактные свойства  ======\n");

        System.out.println("==taylor==\n");
        Performer performer_11 = (Performer) ctx.getBean("taylor");
        performer_11.perform();

        System.out.println("\n==stevie==\n");
        Performer performer_12 = (Performer) ctx.getBean("stevie");
        performer_12.perform();

        System.out.println("\n======== Общие абстрактные свойства  ======\n");

        System.out.println("==taylor_2==\n");

        Performer performer_13 = (Performer) ctx.getBean("taylor_2");
        performer_13.perform();

        System.out.println("\n==stevie_2==\n");
        Performer performer_14 = (Performer) ctx.getBean("stevie_2");
        performer_14.perform();


        System.out.println("\n======== 3.2.1. Основы замещения методов  ======\n");

        Performer performer_15 = (Performer) ctx.getBean("harry");
        performer_15.perform();


        System.out.println("\n======== 3.2.2. Использование внедрения методов чтения  ======\n");
        System.out.println("==stevie_3==\n");

        Performer performer_16 = (Performer) ctx.getBean("stevie_3");
        performer_16.perform();


        System.out.println("\n======== 3.3. Внедрение не-Spring компонентов  ======\n");
        System.out.println("==stevie_3==\n");

        Performer performer_17 = (Performer) ctx.getBean("pianist");
        performer_17.perform();
*/


    }

}
