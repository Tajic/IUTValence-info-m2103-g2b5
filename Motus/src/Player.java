
/**
 * Word key in by player
 * @author robinhug
 *
 */
public class Player 
{
	/**
	 * 
	 */
	private final static int DEFAULT_LENGTH= 4;
	/**
	 * Size of the word given by the player
	 */
	private static int wordLength;
	
	/**
	 * Initialize the Size of the word of player
	 * @param lengthOfTheWord number of letter in the word
	 */
	public Player(int lengthOfTheWord)
	{
		wordLength = lengthOfTheWord;
	}
	
	public Player() 
	{
		wordLength = DEFAULT_LENGTH;
	}

	/**
	 * @return the wordLength
	 */
	public static int getWordLength() 
	{
		return wordLength;
	}
	
	/**
	 * @param word key in by the player
	 * @return word proposed by the player
	 */
	public String getProposedWord(String word)
	{
		
		return word;
		//TODO return the word written by the player.
	}

	
	
}
