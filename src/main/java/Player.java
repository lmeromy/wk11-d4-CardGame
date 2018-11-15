import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name, ArrayList<Card> hand) {
        this.name = name;
        this.hand = hand;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public int getHandTotal() {
        int total = 0;
        for(Card card: this.hand){
            total += card.getValueFromEnum();
        }
        return total;

    }
}
