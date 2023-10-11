import java.util.List;
import java.util.Random;

public class DeckOfCardsSueca extends DeckOfCards {

    List<Card> sueca = this.getDeck();
    public DeckOfCardsSueca() {
        super();
        for (int i = 0; i < sueca.size(); i++) {
            Card c = sueca.get(i);
            if (c.getFace().equals("Eight") || c.getFace().equals("Nine") || c.getFace().equals("Ten")) {
                sueca.remove(i);
                i--;
            } else if (c.getFace().equals("Ace")) {
                c.setValue(11);
            } else if (c.getFace().equals("Seven")) {
                c.setValue(10);
            } else if (c.getFace().equals("King")) {
                c.setValue(4);
            } else if (c.getFace().equals("Jack")) {
                c.setValue(3);
            } else if (c.getFace().equals("Queen")) {
                c.setValue(2);
            } else if (c.getFace().equals("Deuce") || c.getFace().equals("Three") || c.getFace().equals("Four") ||
                    c.getFace().equals("Five") || c.getFace().equals("Six")) {
                c.setValue(0);
            }
        }

        
    }
    public Card mostrarTrunfo(){
            Random random = new Random();
            int i = random.nextInt(sueca.size());
            Card c = sueca.get(i);
            return c;
        }
}
