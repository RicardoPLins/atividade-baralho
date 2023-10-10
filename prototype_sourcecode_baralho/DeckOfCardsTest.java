// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

public class DeckOfCardsTest {
   // executa o aplicativo
   public static void main(String args[]) {
      DeckOfCards myDeckOfCards = new DeckOfCardsNormal();
      // myDeckOfCards.shuffle(); // coloca Cards em ordem aleat�ria
      
      DeckOfCards Cartas = new DeckOfCardsSueca();
      

      // imprime todas as 52 cartas na ordem em que elas s�o distribu�das
      System.out.println("Size: " + myDeckOfCards.size());
      System.out.println(myDeckOfCards);

      System.out.println("Removendo 26 cartas a partir do topo do baralho: ");

      for (int i = 0; i < 26; i++) {
         System.out.printf("%-20s\n", myDeckOfCards.dealCard());
         // distribui e imprime 4 Cards
         // System.out.printf( "%-20s%-20s%-20s%-20s\n",
         // myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
         // myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
      } // for final

      System.out.println("Baralho da sueca: ");

      for (int i = 0; i < Cartas.size(); i++) {
         System.out.println(Cartas.get(i));
      }
      System.out.println("Tamanho do baralho da sueca: " + Cartas.size());

      System.out.println("Size: " + myDeckOfCards.size());

   } // fim de main
} // fim da classe DeckOfCardsTest
