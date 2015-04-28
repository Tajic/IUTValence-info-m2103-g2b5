
/**
 * Create cases of Motus where letter will be display
 * @author robinhug
 *
 */
public class Cases 
{
	/**
	 *
	 * Define a number of cases by default of the word to find
	 * 1 letter = 1 case
	 */
	private final static int NBCASEDEFAUT=10;
	
	/**
	 * number of case
	 * 1 letter = 1 case
	 */
	private int nbCase;
	
	
	/**
	 * save the number of cases by default to NBCASEDEFAUT
	 */
	public Cases()
	{
		this.nbCase=NBCASEDEFAUT;
	}
	/**
	 * @return nbCase the number of case defined
	 */
	public int obtenirNbCases()
	{
		return this.nbCase;
	}
}
