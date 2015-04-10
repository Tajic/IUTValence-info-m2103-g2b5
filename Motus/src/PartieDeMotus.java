
/**
 * Cr�ation de la partie pour le joueur en m�me temps que l'interface
 * @author robinhug
 *
 */
public class PartieDeMotus 
{	
	/**
	 *nombre de lettre du mot � trouver
	 */
	private int nbLettreDef;
	
	/**
	 * tableau r�pertorant les caract�res du mot � trouver
	 */
	private char[] tabDeCar;
	
	
	/**
	 *cr�e un nouveau mot � chercher
	 * et repertorie son nombre de lettres
	 * @param tab tableau de caract�re du mot � trouver
	 */
	public PartieDeMotus(char[] tab)
	{
		this.nbLettreDef = new UnMot(this.nbLettreDef,this.tabDeCar).obtenirNbLettre();
		this.tabDeCar= tab;
	}
	/**
	 * cr�e un nouveau nombre de lettres pour le mot � trouver
	 */
	public PartieDeMotus()
	{
		this.nbLettreDef = new UnMot(this.nbLettreDef,this.tabDeCar).obtenirNbLettre();
	}
	
	/**
	 * cr�e toute la partie pour que le joueur puisse jouer ainsi que son interface
	 */
	public void jouer() 
	{
		new AfficherCases();
		new MotJoueur(this.tabDeCar);
	}
}
