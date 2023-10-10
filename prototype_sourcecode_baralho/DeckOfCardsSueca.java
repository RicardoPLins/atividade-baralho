public class DeckOfCardsSueca extends DeckOfCards {

    
    public DeckOfCardsSueca(){
        DeckOfCardsSueca().
        for (int i = 0; i < DeckOfCardsSueca().size(); i++) {
            Card c = (Card) Cartas.get(i);
            if (c.getFace().equals("Eight") || c.getFace().equals("Nine") || c.getFace().equals("Ten")) {
               Cartas.retiraCarta(i);
               i--;
            } else if (c.getFace().equals("Ace")) {
               Cartas.get(i).setValue(11);
            } else if (c.getFace().equals("Seven")) {
               Cartas.get(i).setValue(10);
            } else if (c.getFace().equals("King")) {
               Cartas.get(i).setValue(4);
            } else if (c.getFace().equals("Jack")) {
               Cartas.get(i).setValue(3);
            } else if (c.getFace().equals("Queen")) {
               Cartas.get(i).setValue(2);
            } else if (c.getFace().equals("Deuce") || c.getFace().equals("Three") || c.getFace().equals("Four") ||
                  c.getFace().equals("Five") || c.getFace().equals("Six")) {
               Cartas.get(i).setValue(0);
            }
         }

    }

    public void organizarBaralho(DeckOfCards Cartas){
        

    }
}
