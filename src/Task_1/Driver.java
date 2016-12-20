package Task_1;
import java.util.List;
/**
 * 
 * Driver Class
 * 
 * The goal of this program is to offer Movies and Video Games to track for rental. 
 * Unfortunately the program doesn't work 100% as intended. 
 * Everything in the program works with the exception of the tracking of what is and is not rented.
 * I tried using what was learned in the animals lab to assign boolean values of true or false to keep track.
 * However no matter how much I tried I could not get any form of set to assign the value to true when the movie was selected.
 * I spent over 8 hours trying to make this work correctly and was never able to figure out why it wouldn't work.
 * I did extensive research and tried everything I could find and nothing worked.
 * I do not expect a good grade on this assignment. 
 * 
 * 
 * @author Scott Robinson
 *
 */
import java.util.Scanner;

public class Driver 
{
	/**
	 * @param args
	 * main class
	 */
	
	
	
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		/**
		 * @param totalRental is for accumulating the total rental cost
		 * @param mediaSelection is for identifying if the user is selecting movies or games
		 * @param finished is used for determining when to calculate the total
		 * @param selection is used for identifying the users selection of a title
		 * @param counter is used to give each title a number for selection
		 * @param priceOfRent is used to identify the price for each rental
		 * 
		 */
		double totalRental = 0;
		int mediaSelection = 0;
		boolean finished = false;
		int selection = 0;
		int counter = 0;
		double priceOfRental = 0;
		
		List<Movie> mediaList = Movie.getMoviesList();
		
		System.out.println("Welcome to The Movie & Game Store!");
		System.out.println("Below you will find a list of media types. Please select a media type, then a title.\n");
		
		System.out.println();
		
		System.out.print("For Movies enter 1.\n");
		System.out.print("For Video Games enter 2.\n");

		System.out.println();
		/**
		 * 
		 * While loop is checking to see if finished has been set to true, and will continue to run until then
		 * 
		 * 
		 */
		while (!finished)
		{
			System.out.print("Please select a media type now(or enter 999 for your total): ");
			mediaSelection = input.nextInt();
		/**
		 * Even though it's a bad habit, a sentinel value felt the most useful here
		 * 
		 * 
		 */
			if (mediaSelection == 999)
			{
				finished = true;
				//System.out.println(mediaList.get(selection).getRented());
				System.out.printf("Your total for all rentals will be: $%.2f", totalRental);
				break;
			}
			/**
			 * 
			 * Keeping the user from entering unavailable numbers
			 * 
			 */
			if (mediaSelection > 2 || mediaSelection < 0 && mediaSelection != 999)
			{
				System.out.print("We apologize, but you did not enter a valid genre, please try again.\n");
			}
		/**
		 * 
		 * 
		 * This is where the media selection takes place and the price is identified. 
		 * The price was originally supposed to be set inside the Movie and Game classes, but no matter how hard I tried
		 * I could not get them to set correctly.
		 * 
		 * For each loops are used to display all the possible selections.
		 */
			else
			{
				switch(mediaSelection)
				{
					case 1: 
						for (Movie movieList : Movie.getMoviesList())
							System.out.println(counter++ + ": " + movieList);
							counter = 0;
						if (Movie.getMoviesList().get(selection).getYearOfRelease() != 2016)
							{
								priceOfRental = 1.99;
							}
						else
							{
								priceOfRental = 2.99;
							}
						break;
					case 2: 
						for (Game gameList : Game.getGameList())
							System.out.println(counter++ + ": " + gameList);
							counter = 0;
						if (Game.getGameList().get(selection).getReleaseYear() != 2016)
							{
								priceOfRental = 4.99;
							}
						else
							{
								priceOfRental = 7.99;
							}
						break;
				}//Switch These comments help keep track of blocks
			}//ElseThese comments help keep track of blocks
			
			/**
			 * 
			 * 
			 * Here a case/switch statement is used to attempt to set the boolean rental value to true.
			 * However after over 3 hours of attempting, and researching a solution, no success was had in changing
			 * the values to true. I am leaving the code in here that was attempted to see if you can possibly provide me 
			 * with assistance. I am only putting the code in the first line as anything after that is pointless. 
			 * 
			 */
			System.out.print("Please enter the number of the movie you would like to rent: ");
			selection = input.nextInt();	
			switch (selection)
			{
				case 0:
					if (mediaList.get(selection).getRented() == true)
				{
					System.out.println("We apologize, but that movie is currently rented by another person.");
					break;
				}
					else				
					mediaList.get(selection).setRented(true);
					totalRental += priceOfRental;			
					break;
				case 1:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 2:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 3:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 4:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 5:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 6:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 7:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 8:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 9:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				case 10:
					Movie.getMoviesList().get(selection).setRented(true);
					totalRental += priceOfRental;
					break;
				default:
					System.out.println("You entered an invalid number!");
					break;
			}//Switch			These comments help keep track of blocks
		}//While	These comments help keep track of blocks
		input.close();
	}//Main	These comments help keep track of blocks
}//Class	These comments help keep track of blocks
