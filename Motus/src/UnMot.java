
/**
 * Definition du mot recherché par la suit par le joueur
 * @author robinhug
 *
 */
public class UnMot 
{
	/**
	 * 
	 */
	private int nbLettre;
	/**
	 * 
	 */
	private char[] leMot;
	
	/**
	 * @param nb 
	 * @param motEntre
	 */
	public UnMot(int nb, char[] motEntre)
	{
		this.nbLettre=nb;
		this.leMot=motEntre;
	}
	
	/**
	 * @return
	 */
	public int obtenirNbLettre()
	{
		return this.nbLettre;
	}
	
	/**
	 * @return
	 */
	public char[] obtenirLeMot()
	{
		return this.leMot;
	}
}
