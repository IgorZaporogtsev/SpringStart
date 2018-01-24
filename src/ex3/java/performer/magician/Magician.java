package ex3.java.performer.magician;

import ex3.java.performer.Performer;

public class Magician implements Performer {

    public Magician() {}

    public void perform() {
        System.out.println(magicWords);
        System.out.println("The magic box contains...");
        System.out.println(magicBox.getContents()); // Исследует содержимое ящика
    }
    // внедрение

    private MagicBoxImpl magicBox;

    public void setMagicBox(MagicBoxImpl magicBox) {
        this.magicBox = magicBox; // Внедрение волшебного ящика
    }

    private String magicWords;

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

}
