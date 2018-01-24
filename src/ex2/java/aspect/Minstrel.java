package ex2.java.aspect;


// класс это наш Аспект в АОП (аспектно ориентированом программировании)
public class Minstrel {

    public void singBeforeQuest() { // Вызывается перед выполнением задания
        System.out.println("Ла-ла-ла Рыцарь такой храбрый");
    }
    public void singAfterQuest() { // Вызывается после выполнения задания
        System.out.println("Ла-ла-ла Рыцарь Храбрый рыцарь отправился в поход ");
    }
}
