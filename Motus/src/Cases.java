
/**
 * Classe Cases du Motus dans lesquelles les lettres devront s'afficher
 * @author robinhug
 *
 */
public class Cases 
{
	/**
	 * Constante indiquant le nombre de lettre par defaut du mot à trouver
	 * 1 lettre = 1 case
	 */
	private final static int NBCASEDEFAUT=10;
	
	/**
	 * permet de définir nous même le nombre de lettre du mot à trouver
	 * 1 lettre = 1 case
	 */
	private int nbCase;
	
	
	/**
	 * enregistre que le nombre de cases est par défaut à NBCASEDEFAUT
	 */
	public Cases()
	{
		this.nbCase=NBCASEDEFAUT;
	}
	/**
	 * enregistre le nombre de cases défini par le nombre de lettres demandé par le joueur
	 * @param nb nombre de lettres entrées
	 */
	public Cases(int nb)
	{
		this.nbCase=nb;
	}
	
	/**
	 * @return le nombre de case de la grille
	 */
	public int obtenirNbCases()
	{
		return this.nbCase;
	}
}
