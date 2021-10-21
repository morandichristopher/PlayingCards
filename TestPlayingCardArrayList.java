package labproject4.prob1;
import java.util.ArrayList;
/**
 * Your name:
 * 
 * Construct 52 PlayingCards and add them to a deck.
 * 
 * **NOTE**: Read all comments below thoroughly.
 */

public class TestPlayingCardArrayList
{
    public static void main(String[] args)
    {
    	ArrayList<PlayingCard> deck = new ArrayList<>();



        // 2 - Construct the 52 PlayingCards in a standard deck of cards
        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
        //     and add them to the deck. You must use a loop (or
        //     nested loops).
    	// value: 1-13
    	// suit: 1-4

    	//suit loop
    	for(int value=1; value<=13; value++) {
    		//value loop
    		for(int suit=1; suit<=4; suit++) {
    			PlayingCard pc = new PlayingCard(value, suit);
    			deck.add(pc);
    			
    			// System.out.println("suit: "+suit+", value="+value);
    			
    			
    		}
    	}


        // 3 - Display the value and suit of every PlayingCard in the deck.
        //     You must use a loop.
        for(PlayingCard pc : deck) {
        	System.out.println(pc); //implement toString() in PlayingCard first for this to work.
        }        
	}
}