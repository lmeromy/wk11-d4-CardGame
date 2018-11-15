import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CardTest {

    Card card;

    @Before
    public void setup(){
        card = new Card(Suit.HEARTS, Rank.ACE);
    }

    @Test
    public void canGetSuit(){
        assertEquals(Suit.HEARTS, card.getSuit());
    }


    @Test
    public void canGetRank(){
        assertEquals(Rank.ACE, card.getRank());
    }

    @Test
    public void queenHasValue10() {
        Card card = new Card(Suit.HEARTS, Rank.QUEEN);
        assertEquals(10, card.getValueFromEnum());
    }

//    Suit[] suits = Suit.values();  // this is an Array! not ArrayList


}
