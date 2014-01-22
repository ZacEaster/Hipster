package hipster.model;

public class Hipster
{
	/**
	 * Declaration Section
	 */
	private String name;
	private String hipsterType;
	private String hipsterPhrase;

	/**
	 * Array that creates values for me
	 */
	public Hipster()
	{
		hipsterBooks = new String[5];
		name = "Zac";
		hipsterType = "Student Hipster";
		hipsterPhrase = "Gyped";

		fillTheBooks();

	}

	/**
	 * Creates a Hipster Object with the specified parameters to fill in the
	 * component data members
	 * 
	 * @param name
	 *            The name of the created Hipster.
	 * @param hipsterType
	 * @param hipsterPhrase
	 * @param hipsterBooks
	 */

	public Hipster(String name, String hipsterType, String hipsterPhrase,
			String[] hipsterBooks)
	{
		this.name = name;
		this.hipsterBooks = hipsterBooks;
		this.hipsterPhrase = hipsterPhrase;
		this.hipsterType = hipsterType;
	}

	/**
	 * Setters and getters.
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	public String getHipsterType()
	{
		return hipsterType;
	}

	public String getHipsterPhrase()
	{
		return hipsterPhrase;
	}

	public String[] getHipsterBooks()
	{
		return hipsterBooks;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setHipsterType(String hipsterType)
	{
		this.hipsterType = hipsterType;
	}

	public void setHipsterPhrase(String hipsterPhrase)
	{
		this.hipsterPhrase = hipsterPhrase;
	}

	public void setHipsterBooks(String[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}

	private String[] hipsterBooks;

	/**
	 * Stores names within the certain books.
	 */
	private void fillTheBooks()
	{
		hipsterBooks[0] = "Oxford Dictionary";
		hipsterBooks[1] = "Snow Crash";
		hipsterBooks[2] = "1984";
		hipsterBooks[3] = "American Gods";
		hipsterBooks[4] = "V for Vendetta";
	}

}
