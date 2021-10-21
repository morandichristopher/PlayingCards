package labproject4.prob1;

/**
 * Your name:
 * 
 * Construct 52 PlayingCards and add them to a deck.
 * 
 * **NOTE**: Read all comments below thoroughly.
 */

public class TestPlayingCard
{
    public static void main(String[] args)
    {
    	 // 1 - Construct an array of 52 PlayingCard objects called deck.
    	PlayingCard[] deck = new PlayingCard[52];



        // 2 - Construct the 52 PlayingCards in a standard deck of cards
        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
        //     and add them to the deck. You must use a loop (or
        //     nested loops).
    	// value: 1-13
    	// suit: 1-4
    	
    	int counter = 0;
    	//suit loop
    	for(int value=1; value<=13; value++) {
    		//value loop
    		for(int suit=1; suit<=4; suit++) {
    			PlayingCard pc = new PlayingCard(value, suit);
    			deck[counter] = pc;
    			
    			// System.out.println("counter (index in deck): "+counter);
    			// System.out.println("suit: "+suit+", value="+value);
    			
    			counter++;
    		}
    	}
        


        // 3 - Display the value and suit of every PlayingCard in the deck.
        //     You must use a loop.
        for(PlayingCard pc : deck) {
        	System.out.println(pc); //implement toString() in PlayingCard first for this to work.
        } 
    }
}