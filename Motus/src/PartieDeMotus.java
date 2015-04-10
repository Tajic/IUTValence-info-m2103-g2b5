
/**
 * Création de la partie pour le joueur en même temps que l'interface
 * @author robinhug
 *
 */
public class PartieDeMotus 
{	
	/**
	 *nombre de lettre du mot à trouver
	 */
	private int nbLettreDef;
	
	/**
	 * tableau répertorant les caractères du mot à trouver
	 */
	private char[] tabDeCar;
	
	
	/**
	 *crée un nouveau mot à chercher
	 * et repertorie son nombre de lettres
	 * @param tab tableau de caractère du mot à trouver
	 */
	public PartieDeMotus(char[] tab)
	{
		this.nbLettreDef = new UnMot(this.nbLettreDef,this.tabDeCar).obtenirNbLettre();
		this.tabDeCar= tab;
	}
	/**
	 * crée un nouveau nombre de lettres pour le mot à trouver
	 */
	public PartieDeMotus()
	{
		this.nbLettreDef = new UnMot(this.nbLettreDef,this.tabDeCar).obtenirNbLettre();
	}
	
	/**
	 * crée toute la partie pour que le joueur puisse jouer ainsi que son interface
	 */
	public void jouer() 
	{
		new AfficherCases();
		new MotJoueur(this.tabDeCar);
	}
}
