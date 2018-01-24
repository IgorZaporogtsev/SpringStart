package ex2.java;

import ex2.java.knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args) {

        // Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("ex2/resources/knights.xml");

//================================================Рыцарь-1==============================================================

        System.out.println("Рыцарь Гарольд");
        // Получение компонента knight
        Knight knight_1 = (Knight) context.getBean("knight_1");

        // Использование компонента knight
        knight_1.embarkOnQuest();

        // Получение компонента knight
        knight_1 = (Knight) context.getBean("knight_3");

        // Использование компонента knight
        knight_1.embarkOnQuest();



//================================================Рыцарь-2==============================================================

        System.out.println("Рыцарь Чарльз");
        // Получение компонента knight
        Knight knight_2 = (Knight) context.getBean("knight_2");

        // Использование компонента knight
        knight_2.embarkOnQuest();

    }


}
