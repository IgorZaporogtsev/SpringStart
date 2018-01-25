package ex4.java.performer.instrumentalist;

import ex4.java.performer.Instrument;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // помечаем что бин
@Qualifier("key_instrument")
public class Piano implements Instrument {

    public Piano() {
    }

    public void play() {
        System.out.println("Piano is play");
    }

}
