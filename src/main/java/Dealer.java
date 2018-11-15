public class Dealer {

    private Deck deck;

    public Dealer() {
        this.deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }

    public int shuffle(){
        this.deck.populate();
        int deckLength = this.deck.getDeck().size();

        int random = (int)(Math.random() * deckLength-1);
        return random;
    }

    public void deal(Player player){
        Dealer dealer = new Dealer();
        this.deck.populate();
        int ourRandomNum = dealer.shuffle();

        Card cardToDeal = this.deck.getDeck().get(ourRandomNum);
        this.deck.getDeck().remove(cardToDeal);
        player.getHand().add(cardToDeal);
    }

    public String declareWinner(Player player1, Player player2){
//        Dealer dealer = new Dealer();
        int p1_Score = player1.getHandTotal();
        int p2_Score = player2.getHandTotal();

        if(p1_Score < p2_Score){
            return "Winner is Player 2!";
        } else {
            return "Winner is Player 1!";
        }
    }
}
