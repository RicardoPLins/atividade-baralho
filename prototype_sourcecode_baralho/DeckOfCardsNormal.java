import java.util.ArrayList;
import java.util.Random;

public class DeckOfCardsNormal extends DeckOfCards{

    public DeckOfCardsNormal(){
        super();
    }

public DeckOfCardsNormal clone() {
    DeckOfCardsNormal clonedDeck = new DeckOfCardsNormal();

    clonedDeck.getDeck().clear();

    for (Card card : this.getDeck()) {
        clonedDeck.getDeck().add(new Card(card.getFace(), card.getSuit(), card.getValue()));
    }
    clonedDeck.shuffle();

    return clonedDeck;
}
    
}
