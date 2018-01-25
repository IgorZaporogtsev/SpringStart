package ex4.java.performer.instrumentalist;

import ex4.java.performer.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // помечаем что бин или в XML  <bean id="piano" class="ex4.java.performer.instrumentalist.Piano" />
@Qualifier("key_instrument")
public class Piano implements Instrument {

    public Piano() {
    }

    public void play() {
        System.out.println("Piano is play");
    }

}
