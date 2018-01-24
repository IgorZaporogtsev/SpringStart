package ex3.java.performer.instrumentalist;

import ex3.java.performer.Instrument;
import ex3.java.performer.Performer;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable("pianist")
public abstract class NewInstrumentalist implements Performer{

    public NewInstrumentalist() {
    }

    public void perform(){
        System.out.print("Playing " + song + " : ");
        getInstrument().play();                     // Используется внедряемый метод getInstrument()
    }

    private String song;

    public void setSong(String song) {
        this.song = song;
    }

    /*private Instrument instrument;

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }*/

    public abstract Instrument getInstrument(); // Внедряемый метод
}
