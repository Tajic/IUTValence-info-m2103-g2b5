
/**
 * Classe Cases du Motus dans lesquelles les lettres devront s'afficher
 * @author robinhug
 *
 */
public class Cases 
{
	/**
	 * Constante indiquant le nombre de lettre par defaut du mot � trouver
	 * 1 lettre = 1 case
	 */
	private final static int NBCASEDEFAUT=10;
	
	/**
	 * permet de d�finir nous m�me le nombre de lettre du mot � trouver
	 * 1 lettre = 1 case
	 */
	private int nbCase;
	
	
	/**
	 * enregistre que le nombre de cases est par d�faut � NBCASEDEFAUT
	 */
	public Cases()
	{
		this.nbCase=NBCASEDEFAUT;
	}
	/**
	 * enregistre le nombre de cases d�fini par le nombre de lettres demand� par le joueur
	 * @param nb nombre de lettres entr�es
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
