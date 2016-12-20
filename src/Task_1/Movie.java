package Task_1;

import java.util.ArrayList;
/**
 * 
 * Movie Class
 * 
 * 
 * 
 * @author Scott Robinson
 *
 */
/**
 * @author Scott
 *
 */
public class Movie {

	private String title;
	private String rating;
	private int yearOfRelease;
	private String runTime;
	public boolean rented;
	private String genre;

	/**
	 * @param title title of the show
	 * @param rating the MPAA rating
	 * @param yearOfRelease the year the movie was released
	 * @param runTime length of the movie
	 * @param genre genre of the movie
	 * @param rented this boolean was supposed to represent whether or not the movie had been rented
	 */
	public Movie(String title, String rating, int yearOfRelease, String runTime, String genre, boolean rented) 
	{
		super();
		this.title = title;
		this.rating = rating;
		this.yearOfRelease = yearOfRelease;
		this.runTime = runTime;
		this.rented = rented;
		this.genre = genre;
	}
	
	
	
	
	/**
	 * @return
	 * 
	 * Static ArrayList to keep track of movies, along with their pertinent information. 
	 */
	public static ArrayList<Movie> getMoviesList()
	{
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		
		Movie theDarkKnight = new Movie("The Dark Knight", "PG-13", 2008, "Action", "152 Minutes", false);
		Movie theMatrix = new Movie("The Matrix", "R", 1999,"Action", "136 Minutes", false);
		Movie deadpool = new Movie("Deadpool", "R", 2016,"Action", "108 Minutes", false);
		Movie savingPrivateRyan = new Movie("Saving Private Ryan", "R", 1998,"Action", "169 Minutes", false);
		Movie terminator2JudgmentDay = new Movie("Terminator 2: Judgement Day", "R", 1991,"Action", "137 Minutes", false);
		Movie shawshankRedemption = new Movie("The Shawshank Redemption", "R", 1994, "Drama", "142 Minutes", false);
		Movie pulpFiction = new Movie("Pulp Fiction", "R", 1994, "Drama", "154 Minutes", false);
		Movie forrestGump = new Movie("Forrest Gump", "PG-13", 1994, "Drama", "142 Minutes", false);
		Movie cuckoosNest = new Movie("One Flew Over The Cuckoo's Nest", "R", 1975, "Drama", "133 Minutes", false);
		Movie goodfellas = new Movie("Goodfellas", "R", 1990, "146 Minutes", "Drama", false);
		Movie theIntouchables = new Movie("The Intouchables", "R", 2011, "Comedy", "112 Minutes", false);
		
		movieList.add(theDarkKnight);
		movieList.add(theMatrix);
		movieList.add(deadpool);
		movieList.add(savingPrivateRyan);
		movieList.add(terminator2JudgmentDay);
		movieList.add(shawshankRedemption);
		movieList.add(pulpFiction);
		movieList.add(forrestGump);
		movieList.add(cuckoosNest);
		movieList.add(goodfellas);
		movieList.add(theIntouchables);
		
		return movieList;
	}

	/**
	 * @return
	 * returns the title
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * @param title
	 * sets the title
	 */
	public void setTitle(String title) 
	{
		this.title = title;
	}

	/**
	 * @return
	 * returns the rating
	 */
	public String getRating() 
	{
		return rating;
	}

	/**
	 * @param rating
	 * sets the rating
	 */
	public void setRating(String rating) 
	{
		this.rating = rating;
	}

	/**
	 * @return
	 * returns the year of release
	 */
	public int getYearOfRelease() 
	{
		return yearOfRelease;
	}

	/**
	 * @param yearOfRelease
	 * sets the year of release
	 */
	public void setYearOfRelease(int yearOfRelease) 
	{
		this.yearOfRelease = yearOfRelease;
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
	 * returns the length
	 */
	public String getRunTime() 
	{
		return runTime;
	}

	/**
	 * @param runTime
	 * sets the length
	 */
	public void setRunTime(String runTime) 
	{
		this.runTime = runTime;
	}

	/**
	 * @return
	 * returns a boolean of true or false for the movie being rented
	 */
	public boolean getRented() 
	{
		return rented;
	}

	/**
	 * @param rented
	 * was supposed to set a boolean value
	 */
	public void setRented(boolean rented) 
	{
		this.rented = rented;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * To string for text being displayed in other class.
	 */
	@Override
	public String toString() 
	{
		return title + " || Rating:" + rating + " || " + yearOfRelease + " || " + genre + " || " + runTime;
	}
	
	
}
