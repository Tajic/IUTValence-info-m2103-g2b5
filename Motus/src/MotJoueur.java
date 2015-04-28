
/**
 * Word key in by player
 * @author robinhug
 *
 */
public class MotJoueur 
{
	/**
	 * Word key in by player
	 */
	public char[] leMotDuJoueur;
	/**
	 * Save motEntreJoue within leMotDuJoueur
	 * @param motEntreJoue is the word of the player
	 */
	public MotJoueur(char[] motEntreJoue)
	{
		this.leMotDuJoueur=motEntreJoue;
	}
	/**
	 * @return the word of player
	 */
	public char[] getMotJoueur()
	{
		return this.leMotDuJoueur;		
	}
	
}
