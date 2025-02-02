package CardGame;
/**
 * A class to handle the user interaction for the Card
 * project. Contains a main method that generates a card hand
 * and then iterates over it to print its contents to the console.
 * 
 */
public class GamePlayer {

	public static void main(String[] args) {
		CardHand ch = new CardHand();
                
                //create 52 Cards
                ch.generateHand();
                
                
                for(Card c: ch.cards)
                {
                    System.out.println(c.getValue() + " of " + c.getSuit());
                }
        }
}
               // System.out.println(ch.cards); show what happens when there is no toString()
