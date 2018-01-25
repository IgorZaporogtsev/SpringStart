package ex4.java.performer.instrumentalist;

import ex4.java.performer.Instrument;
import ex4.java.performer.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
/*
 <bean id="benny"
          class="ex4.java.performer.instrumentalist.Instrumentalist">
        <property name="song" value="Jingle Bells" />
       <property name="instrument" ref="saxophone" />
    </bean>
*/
@Component("benny")
public class Instrumentalist implements Performer{

    public Instrumentalist() {
    }

    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public void setSong(String song) { // Внедрение мелодии атрибут value="Jingle Bells" в компоненте в файле xml
        this.song = song;

    }

    public String getSong() {
        return song;
    }

    public String screamSong() {
        return song;
    }

    private Instrument instrument;

    /*
     @Qualifier("piano") или @Qualifier("saxophone")  помогает жестко обозначить ПО КЛЮЧУ какой компонент выбирвать Saxophone или Piano
      Нужно использовать этот XML
      <bean id="saxophone"-->
          <!--class="ex4.java.performer.instrumentalist.Saxophone" />
          <bean id="piano"-->
          <!--class="ex4.java.performer.instrumentalist.Piano" />-



     @Qualifier("key_instrument")  помогает жестко обозначить ПО ИМЕНИ какой компонент выбирвать Saxophone или Piano

      Можно использовать этот XML или в Piano.class добавить @Qualifier("key_instrument")
     <bean class="ex4.java.performer.instrumentalist.Piano">
        <qualifier value="key_instrument" />
    </bean>


    */

    @Autowired
    @Qualifier("key_instrument")

    public void setInstrument(Instrument instrument) { // Внедрение инструмента атрибут ref="saxophone" в компоненте в файле xml
        this.instrument = instrument;

    }
}
