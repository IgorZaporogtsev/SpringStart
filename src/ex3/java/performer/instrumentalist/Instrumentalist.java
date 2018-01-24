package ex3.java.performer.instrumentalist;

import ex3.java.performer.Instrument;
import ex3.java.performer.Performer;


public class Instrumentalist implements Performer {

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

    public void setInstrument(Instrument instrument) { // Внедрение инструмента атрибут ref="saxophone" в компоненте в файле xml
        this.instrument = instrument;

    }
}
