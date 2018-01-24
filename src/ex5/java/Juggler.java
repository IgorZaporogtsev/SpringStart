package ex5.java;


public class Juggler implements Performer {
    private int beanBags = 15;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    public void perform(){
        System.out.println("JUGGLING " + beanBags + " BEANBAGS\n");
    }


}
