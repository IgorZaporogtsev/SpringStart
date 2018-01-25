package ex4.java.performer.instrumentalist;

import ex4.java.performer.Instrument;
import ex4.java.performer.Performer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

    @Autowired
    @Qualifier("key_instrument") //помогает жестко обозначить какой компонент выбирвать Saxophone или Piano
    public void setInstrument(Instrument instrument) { // Внедрение инструмента атрибут ref="saxophone" в компоненте в файле xml
        this.instrument = instrument;

    }
}
