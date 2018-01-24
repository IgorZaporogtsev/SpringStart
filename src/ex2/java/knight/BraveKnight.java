package ex2.java.knight;

import ex2.java.quest.Quest;

public class BraveKnight implements Knight{
    private Quest quest;
   // private Minstrel minstrel;

    public BraveKnight(Quest quest/*, Minstrel minstrel*/) {
        this.quest = quest;             // Внедрение сценария подвига
       // this.minstrel = minstrel;
    }


    public void embarkOnQuest() {    //embark - начинает Квест (береться за Квест)
     //   minstrel.singBeforeQuest();
        quest.embark();
      //  minstrel.singAfterQuest();
    }

}
