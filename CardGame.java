import java.util.Scanner;
public class CardGame {
public static void main(String[] args) {
	/**This program will be running a card game!
	 * 
	 * Rules of the game are:
	 * The players choose how many cards the deck will be.
	 * Each player takes turns drawing up to 3 cards from the deck. This goes on until there are no cards left.
	 * The player who draws the last card is declared the winner.
	 * 
	 * ALGORITHM
	 * Set variables for cards in deck and cards drawn, both given by user.
	 * Ask player to set the deck count.
	 * Ask player to draw up to 3.
	 * Set the deck count = the old count - cards drawn.
	 * End game when there's 0 cards left, all using a while loop.
	 */
	
	//First I will declare my variables.
	int deckcount, cardcount;
	
	//Now we ask the user how many cards to start with
	System.out.print("Enter the number of cards to begin with: ");
	Scanner sc = new Scanner(System.in);
	deckcount=sc.nextInt();
	
	//Our while loop allows the game to be played. Basically, while there's cards in the deck, players will play.
	while (deckcount > 0) {
		
		System.out.print("How many cards do you want to draw? ");
		cardcount=sc.nextInt();
		//This gets the ball rolling. Every turn we begin by asking how many cards player wants to draw.
		
		if (cardcount > deckcount && !(cardcount>3)) {
			System.out.println("IMPOSSIBLE! There are only " + deckcount + " card(s) left. Please re-enter an appropriate amount!");
		}
		//This if statement prevents a player from choosing more cards than there are left in the deck (must still be a # from 1-3).

		else if (cardcount<=3) {
		deckcount = deckcount - cardcount;
			System.out.println("There are " + deckcount + " card(s) left in the deck. ");
		}
		//This else if statement is the game part. It takes the # the player enters and takes that many cards from the deck.
		//Then, after that resolves, the deck count becomes the result of the previous action and it prints the # of cards left.
		
		else {
			
			System.out.println("INVALID: You must enter a number from 1-3!");
		}
		//This else statement prevents the player from choosing a # not 1-3, or any other input.
		}

	if (deckcount==0) {
		System.out.print("Congratulations. You win the game!");
	}
	//NOTE: This if statement is NOT in the while loop. Once the deckcount reachs 0 the while loop ends and we go to this - the winner.
}
}
/**
*MEMORY TRACE
*deckcount = # entered by user. This is how many cards will be in the deck. After cardcount is entered, deckcount becomes the last deckdcount - cardcount.
*cardcount = # entered by user. This is how many cards the turn player wants to draw.
*
*HANDCHECK
*Let's start with 11 cards.
*Player 1 draws 3. (Program computes 11-3) 8 cards left.
*Player 2 draws 1. (8-1) 7 cards left.
*Player 1 draws 3. (7-3) 4 cards left.
*Player 2 draws 2. (4-2) 2 cards left.
*Player 1 draws 2. (2-2) 0 cards left. Player 1 wins.
*/