package ex3.java.performer.oneManBand;

import ex3.java.performer.Instrument;
import ex3.java.performer.Performer;

import java.util.Map;

public class OneManBandMap implements Performer {

    public OneManBandMap() {
    }


    public void perform()  {

        for (String key : instruments.keySet()) {
            System.out.print(key + " : ");
            Instrument instrument = instruments.get(key);
            instrument.play();
        }
    }

    private Map<String, Instrument> instruments;

    public void setInstruments(Map<String, Instrument> instruments) {

        this.instruments = instruments;          // Внедрение инструментов в виде отображения (Map)
    }


}
