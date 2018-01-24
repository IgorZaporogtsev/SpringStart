package ex2.test;


import ex2.java.knight.BraveKnight;
import ex2.java.quest.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest()  {

        Quest mockQuest = mock (Quest.class); // Создание фиктивного объекта Quest

        BraveKnight knight = new BraveKnight(mockQuest); // Внедрение

        knight.embarkOnQuest();

        verify(mockQuest, times(1)).embark();
    }
}
