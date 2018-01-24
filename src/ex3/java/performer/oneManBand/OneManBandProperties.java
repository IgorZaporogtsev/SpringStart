package ex3.java.performer.oneManBand;

import ex3.java.performer.Performer;

import java.util.Properties;

public class OneManBandProperties implements Performer {

    public OneManBandProperties() {
    }


    public void perform()  {

        for (String key: instruments.stringPropertyNames()) {
            System.out.print(key + " : " + instruments.getProperty(key)+ "\n");
        }
    }

    private Properties instruments;

    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }


}
