import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class DealerTest {

//    Deck deck;
    Dealer dealer;
    Player player1;
    Player player2;
    ArrayList<Card> hand1;
    ArrayList<Card> hand2;

    @Before
    public void setup(){
//        deck = new Deck();
        dealer = new Dealer();
        hand1 = new ArrayList<Card>();
        hand2 = new ArrayList<Card>();
        player1 = new Player("Stephen", hand1);
        player2 = new Player("Leah", hand2);
    }

    @Test
    public void canGenerateRandomIntLessThan51(){
        Integer testShuffle = dealer.shuffle();
        assertTrue(testShuffle instanceof Integer);
        assertTrue(testShuffle <= 51);
    }

    @Test
    public void canDealCard(){
        dealer.deal(player1);
        assertEquals(51, dealer.getDeck().getDeck().size());
        assertEquals(1, player1.getHand().size());
    }

    @Test
    public void canDeclareWinner(){
        dealer.deal(player1);
        dealer.deal(player2);
        assertEquals("Winner is Player 2!", dealer.declareWinner(player1, player2));
    }
}
