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
		while (MotusGame.getNumberOfTries()<=numberOfTries)
		{
			System.out.println("Veuillez entrer un mot:");
			String wordPlayer=new Scanner(System.in).next();
			new MotusGame(,numberOfTries).play(wordPlayer);
		}
	}

}
