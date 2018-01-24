package ex4.java.performer.oneManBand;

import ex4.java.performer.Instrument;
import ex4.java.performer.Performer;

import java.util.Collection;

public class OneManBandList implements Performer {

    public OneManBandList() {
    }

    public void perform() {

        for (Instrument instrument : instruments) {
             instrument.play();
        }
    }

    private Collection<Instrument> instruments;

    public void setInstruments (Collection<Instrument> instruments) {

          this.instruments = instruments;                  // Внедрение коллекции инструментов
    }
}
