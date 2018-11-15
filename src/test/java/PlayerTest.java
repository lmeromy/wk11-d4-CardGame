import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player1;
    ArrayList<Card> hand;
    Card card;

    @Before
    public void setup(){
        hand = new ArrayList<Card>();
        card = new Card(Suit.DIAMONDS, Rank.SEVEN);
        hand.add(card);
        player1 = new Player("Leah", hand);
    }

    @Test
    public void canGetHandTotal(){
        assertEquals(7, player1.getHandTotal());

//        System.out.println(player1.getHandTotal());


    }
}
