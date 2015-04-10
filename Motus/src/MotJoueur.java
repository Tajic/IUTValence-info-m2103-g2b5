
/**
 * Mot entré par le joueur
 * @author robinhug
 *
 */
public class MotJoueur 
{
	/**
	 * mot que va entrer le joueur
	 */
	public char[] leMotDuJoueur;
	/**
	 * enregistre motEntreJoue dans leMotDuJoueur
	 * @param motEntreJoue est le mot entré par le joueur
	 */
	public MotJoueur(char[] motEntreJoue)
	{
		this.leMotDuJoueur=motEntreJoue;
	}
	/**
	 * @return le mot du joueur
	 */
	public char[] getMotJoueur()
	{
		return this.leMotDuJoueur;		
	}
	
}
