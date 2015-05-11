
/**
 * Word key in by player
 * @author robinhug
 *
 */
public class Player 
{
	/**
	 * Size of the word given by the player
	 */
	private final int wordLength;
	
	/**
	 * Initialize the Size of the word of player
	 * @param lengthOfTheWord number of letter in the word
	 */
	public Player(int lengthOfTheWord)
	{
		this.wordLength = lengthOfTheWord;
	}
	
	/**
	 * @return the wordLength
	 */
	public int getWordLength() 
	{
		return this.wordLength;
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
