package ex1;

public class DamselRescuingKnight { //Спасающий рыцарь
    private RescueDamselQuest quest;

    public DamselRescuingKnight() {
        quest = new RescueDamselQuest(); // Тесная связь с классом RescueDamselQuest
    }

    public void embarkOnQuest()  {
        quest.embark();
    }

}
