package ex3.java.performer.juggler;

public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem) {              // Внедрение поэмы Зачем здесь этот конструктор? TODO
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) { // Внедрение количества мячиков и поэмы value="15", ref="sonnet29"
        super(beanBags);
        this.poem = poem;
    }
    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite(); //Sonnet
    }
}
