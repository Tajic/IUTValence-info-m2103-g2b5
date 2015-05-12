import java.awt.event.InputMethodListener;
import java.util.Scanner;


/**
 * Start of the game;
 *
 * @author robinhug
 *
 */

public class Main
{
	/**
	 * Creation of a new game(?)
	 * @param args 
	 *
	 */
	@SuppressWarnings("javadoc")
	public static void main(String[] args)
	{
		
		System.out.println("Veuillez entrer un nombre d'essai:");
		int numberOfTries=new Scanner(System.in).nextInt();
		
		new MotusGame("TEST",numberOfTries);
		new Player();
		for (int numberTries=0;numberTries<numberOfTries;numberTries++)
		{
			MotusGame.play(MotusGame.randomWord(Player.getWordLength()));			
		}
	}

}
