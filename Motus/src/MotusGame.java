
/**
 *
 * Create a new game for the players and the interface
 * @author robinhug
 *
 */
public class MotusGame 
{	
	/**
	 * Number of test by default
	 */
	private final static int DEFAULT_TRIES=10;
	/**
	 * Number of tests that the player can try before loosing
	 */
	private int numberOfTries;
	
	/**
	 * Table where every letter of the word to find is saved
	 */
	private String wordTofind;
	
	
	/**
	 *create a new word to find
	 * @param word to find
	 */
	public MotusGame(String word)
	{
		this.wordTofind = word;
		this.numberOfTries=DEFAULT_TRIES;
	}
	
	/**
	 * Get the number of test that can currently be done before loosing the game
	 */
	public int getNumberOfTries()
	{
		return this.numberOfTries;
	}
	
	/**
	 * create every part of the game for the players as well as it interface
	 */
	public void play() 
	{
		System.out.println(this.toString());
		
	}
	
	public String toString()
	{
		String currentWord="";
		for (int numberOfRow=1;numberOfRow<this.numberOfTries;numberOfRow++)
		{
			
			for (int numberOfColumns=0;numberOfColumns<this.wordTofind.length();numberOfColumns++)
			{
				currentWord=currentWord+" | ";
				currentWord=currentWord+" _ ";			
			}
			currentWord=currentWord+" |\n";

		}
		return currentWord;
	}
}
