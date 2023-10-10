
// classe DeckOfCards representa um baralho.
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class DeckOfCards implements Cloneable {

   private List<Card> deck; // ArrayList usado como uma pilha de objetos
   private final int NUMBER_OF_CARDS = 52; // n�mero constante de Cards
   private Random randomNumbers; // gerador de n�mero aleat�rio

   // construtor preenche baralho de cartas
   public DeckOfCards() {
      String faces[] = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
            "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
      String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

      deck = new ArrayList<Card>(); // cria List de objetos Card
      randomNumbers = new Random(); // cria gerador de n�mero aleat�rio

      // preenche baralho com objetos Card
      for (int count = 0; count < NUMBER_OF_CARDS; count++) {
         deck.add(new Card(faces[count % 13], suits[count / 13], (count % 13) + 1));
      }
   } // fim do construtor DeckOfCards

   public boolean hasCard() {
      return deck.size() > 0;
   }

   // embaralha as cartas com um algoritmo de uma passagem
   public void shuffle() {
      // depois de embaralhar, a distribui��o deve iniciar em deck[ 0 ] novamente

      // para cada Card, seleciona outro Card aleat�rio e os compara
      for (int first = 0; first < deck.size(); first++) {
         // seleciona um n�mero aleat�rio entre 0 e 51
         int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

         // compara Card atual com Card aleatoriamente selecionado
         Card temp = deck.remove(second);
         deck.add(0, temp);
      } // for final
   } // fim do m�todo shuffle

   // distribui um Card, do topo do monte
   public Card dealCard() {
      return deck.remove(deck.size() - 1); // retorna Card atual no array
   } // fim do m�todo dealCard

   public int size() {
      return deck.size();
   }

   // Construtor de cópia para inicializar um novo DeckOfCards a partir de outro
   // DeckOfCards
   public DeckOfCards(DeckOfCards otherDeck) {
      this.deck = new ArrayList<>(otherDeck.deck);
      this.randomNumbers = new Random();
   }

   // Método clone() sobrescrito para criar uma cópia profunda do baralho
   @Override
   public Object clone() {
      try {
         DeckOfCards clonedDeck = (DeckOfCards) super.clone();
         // Copia profunda dos objetos internos, no caso, os Cards
         clonedDeck.deck = new ArrayList<>();
         for (Card card : this.deck) {
            clonedDeck.deck.add(new Card(card.getFace(), card.getSuit(), card.getValue()));
         }
         clonedDeck.randomNumbers = new Random();
         return clonedDeck;
      } catch (CloneNotSupportedException e) {
         // Nunca deve acontecer, já que DeckOfCards implementa Cloneable
         throw new InternalError(e.toString());
      }
   }

   public String toString() {
      String s = "";
      for (Card card : deck) {
         s += card.toString() + "\n";
      }
      return s;
   }

   public Card get(int i) {
      return deck.get(i);
   }

   public Card retiraCarta(int i) {
      return deck.remove(i);
   }

} // fim da classe DeckOfCards
