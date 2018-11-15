import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    Deck deck;

    @Before
    public void setup(){
        deck = new Deck();
    }

    @Test
    public void canPopulateDeck(){
        deck.populate();
        assertEquals(52, deck.getDeck().size());
    }


}
