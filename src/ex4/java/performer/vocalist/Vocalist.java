package ex4.java.performer.vocalist;

import ex4.java.performer.Performer;

public class Vocalist implements Performer {

    public Vocalist (){

    }
    public void perform() {
        System.out.print("Sign " + song + " : \n");
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

}
