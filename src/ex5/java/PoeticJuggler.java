package ex5.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PoeticJuggler extends Juggler {

    PoeticJuggler(){
    }


    @Bean
    public Performer poeticDuke() {                 // <bean id="poeticDuke"
        return new PoeticJuggler(sonnet29());       // class="ex3.java.performer.juggler.PoeticJuggler">
}

    private Poem poem;

    public PoeticJuggler(Poem poem) {              //<constructor-arg value="15" />
        super();                                   //<constructor-arg ref="sonnet29"/>
        this.poem = poem;                          //</bean>
    }

    @Bean
    public Poem sonnet29() {                       //<bean id="sonnet29"
        return new Sonnet29();                     //class="ex3.java.performer.juggler.Sonnet29" />
    }


    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    public void perform() {
        super.perform();
        System.out.println("While reciting...");
        poem.recite(); //Sonnet
    }
}
