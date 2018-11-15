import java.util.ArrayList;

public class Deck {


    private ArrayList<Card> deckCards;

    public Deck() {
        this.deckCards = new ArrayList<Card>();
    }

    public ArrayList<Card> getDeck() {
        return this.deckCards;
    }

    public void populate(){
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();

        for(Suit cardSuit: suits){
            for(Rank cardRank: ranks) {
                Card card = new Card(cardSuit, cardRank);
                this.deckCards.add(card);
            }
        }
    }



}
