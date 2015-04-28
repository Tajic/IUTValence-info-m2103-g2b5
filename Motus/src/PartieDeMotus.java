
/**
 *
 * Create a new game for the players and the interface
 * @author robinhug
 *
 */
public class PartieDeMotus 
{	
	/**
	 *number of letter for the word to find
	 */
	private int nbLettreDef;
	
	/**
	 * Table where every letter of the word to find are saved
	 */
	private char[] tabDeCar;
	
	
	/**
	 *create a new word to find
	 *and save it number of letter
	 * @param tab table where the word is saved
	 */
	public PartieDeMotus(char[] tab)
	{
		this.nbLettreDef = new UnMotATrouver(this.nbLettreDef,this.tabDeCar).obtenirNbLettre();
		this.tabDeCar= tab;
	}
	/**
	 * Save only the number of letter of the word to find
	 * 
	 */
	public PartieDeMotus()
	{
		this.nbLettreDef = new UnMotATrouver(this.nbLettreDef,this.tabDeCar).obtenirNbLettre();
	}
	
	/**
	 * create every part of the game for the players as well as it interface
	 */
	public void jouer() 
	{
		new AfficherCases();
		new MotJoueur(this.tabDeCar);
		
	}
}
