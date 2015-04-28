
/**
 * Create the display of the game
 * @author robinhug
 *
 */
public class AfficherCases 
{
	/**
	 * number of case return by obtenirNbCases()
	 */
	private int number;
	/**
	 *Create the grid for the number of case defind
	 */
	public AfficherCases()
	{
		this.number = new Cases().obtenirNbCases();		
		for (int grid=0;grid<this.number;grid++)
		{
			System.out.println("-----");
			System.out.println("| A |");
			System.out.println("-----");
		}
	}

}
