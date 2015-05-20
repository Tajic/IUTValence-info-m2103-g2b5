import java.util.Scanner;


/**
 * Start of the game;
 *
 * @author robinhug
 *
 */

public class Main implements MotusGameInterface,PlayerInterface
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
		@SuppressWarnings("resource")
		int numberOfTries=new Scanner(System.in).nextInt();
		
		new Player();
		new MotusGame(MotusGame.randomWord(Player.getWordLength()),numberOfTries);
		for (int numberTries=0;numberTries<numberOfTries;numberTries++)
		{
			MotusGame.play(MotusGame.randomWord(Player.getWordLength()));			
		}
	}
}
