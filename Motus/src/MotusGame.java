
/**
 *
 * Create a new game for the players and the interface
 * @author robinhug
 *
 */
public class MotusGame 
{	
	/**
	 * Value by default of the showed letter
	 */
	@SuppressWarnings("unused")
	private final static String DEFAULT_CHAR="_";
	/**
	 * Number of test by default
	 */
	private final static int DEFAULT_TRIES=10;
	/**
	 * Number of tests that the player can try before loosing
	 */
	private static int numberOfTries;
	
	/**
	 * Table where every letter of the word to find is saved
	 */
	private String wordTofind;
	
	
	/**
	 *create a new word to find
	 * @param wordMaster to find
	 * @param numberOfTriesKeyIn by the player
	 */
	public MotusGame(String wordMaster,int numberOfTriesKeyIn)
	{
		this.wordTofind = wordMaster;
		numberOfTries=numberOfTriesKeyIn;		
	}
	
	/**
	 * 
	 */
	public MotusGame()
	{
		numberOfTries=DEFAULT_TRIES;
	}
	
	/**
	 * Get the number of test that can currently be done before loosing the game
	 * @return number of tries.
	 */
	public static int getNumberOfTries()
	{
		return numberOfTries;
	}
	
	/**
	 * create every part of the game for the players as well as it interface
	 * @param wordPlayer key in by the player
	 */
	public void play(String wordPlayer) 
	{
		System.out.println(this.toString(wordPlayer));
		
	}
	
	/**
	 * @param askedWord dial by the player himself
	 * @return currentWord the currently entry word
	 */
	public String toString(String askedWord)
	{
		String word= new Player(4).getProposedWord(askedWord);
		String currentWord="";
		for (int numberOfColumns=0;numberOfColumns<this.wordTofind.length();numberOfColumns++)
		{
			currentWord=currentWord+" | ";
			currentWord=currentWord+word.charAt(numberOfColumns);			
		}
		currentWord=currentWord+" |\n";

		return currentWord;
	}
}
