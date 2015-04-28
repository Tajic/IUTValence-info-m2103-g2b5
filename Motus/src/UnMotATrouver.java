
/**
 * define a word that will be search by player
 * @author robinhug
 *
 */
public class UnMotATrouver 
{
	/**
	 * The number of letter in the word to find.
	 */
	private int nbLettre;
	/**
	 * The table where the word to find will be saved.
	 */
	private char[] leMot;
	
	/**
	 * save manually each parameters of the word to find
	 * @param nb the number of letter
	 * @param motEntre table of the word
	 */
	public UnMotATrouver(int nb, char[] motEntre)
	{
		this.nbLettre=nb;
		this.leMot=motEntre;
	}
	
	/**
	 * @return nbLettre the number of letter of the word
	 */
	public int obtenirNbLettre()
	{
		return this.nbLettre;
	}
	
	/**
	 * @return leMot the table holding the word
	 */
	public char[] obtenirLeMot()
	{
		return this.leMot;
	}
}
