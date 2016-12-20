package Task_1;
/**
 * 
 * Game Class
 * 
 * 
 * 
 * @author Scott Robinson
 *
 */
import java.util.ArrayList;

/**
 * @author Scott
 *
 *Class to hold Game information for rentals
 */
public class Game {
	
	private String title;
	private String genre;
	private int releaseYear;
	
	/**
	 * @param title title of game
	 * @param genre genre of game 
	 * @param releaseYear release year of game
	 */
	public Game(String title, String genre, int releaseYear) 
	
	{
		super();
		this.title = title;
		this.genre = genre;
		this.releaseYear = releaseYear;
	}
	
	/**
	 * @return
	 * Array list to store game information for rentals
	 */
	public static ArrayList<Game> getGameList()
	{
		ArrayList<Game> gameList = new ArrayList<Game>();
		
		Game falloutFour = new Game("Fallout 4", "RPG", 2015);
		Game farCryPrimal = new Game("Far Cry: Primal", "Shooter", 2016);
		Game rocketLeague = new Game("Rocket League", "Sports", 2015);
		Game fifa2016 = new Game("FIFA 2016", "Sports", 2015);
		Game bloodborne = new Game("Bloodborne", "RPG/Adventure", 2015);
		
		gameList.add(falloutFour);
		gameList.add(bloodborne);
		gameList.add(farCryPrimal);
		gameList.add(fifa2016);
		gameList.add(rocketLeague);
		
		return gameList;
	}

	/**
	 * @return
	 * returns the title of the game
	 */
	
	public String getTitle() 
	{
		return title;
	}

	/**
	 * @param title
	 * sets the title of the game
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	/**
	 * @return
	 * returns the genre
	 */
	public String getGenre() 
	{
		return genre;
	}

	/**
	 * @param genre
	 * sets the genre
	 */
	public void setGenre(String genre) 
	{
		this.genre = genre;
	}

	/**
	 * @return
	 * returns the release year
	 */
	public int getReleaseYear() 
	{
		return releaseYear;
	}

	/**
	 * @param releaseYear
	 * sets the release year
	 */
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * simple to string to display game information in the other class.
	 */
	@Override
	public String toString() {
		return  title + " || " + genre + " || " + releaseYear;
	}
	
	
	
	

}
