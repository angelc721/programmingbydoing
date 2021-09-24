//Do While Loops do-while swimming 15pts Angel Chuang
import java.util.Scanner;

public class DoWhileSwimming
{
	public static void main( String[] args ) throws Exception
	{
		Scanner keyboard = new Scanner(System.in);

		String swimmer1 = "GALLANT";
		String swimmer2 = "GOOFUS ";

		double minimumTemperature = 79.0; // degrees Fahrenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;

		System.out.print("What is the current water temperature? ");
		currentTemperature = keyboard.nextDouble();
		savedTemperature = currentTemperature; // saves a copy of this value so we can get it back later.

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer1 + " approaches the lake...." );

		swimTime = 0;
		while ( currentTemperature >= minimumTemperature )
		{
			System.out.print( "\t" + swimmer1 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600); // pauses for 600 milliseconds
			currentTemperature -= 0.5; // subtracts 1/2 a degree from the water temperature
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );
		}

		System.out.println( swimmer1 + " stops swimming. Total swim time: " + swimTime + " min." );

		currentTemperature = savedTemperature; // restores original water temperature

		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
		System.out.println( swimmer2 + " approaches the lake...." );

		swimTime = 0;
		do
		{
			System.out.print( "\t" + swimmer2 + " swims for a bit." );
			swimTime++;
			System.out.println( " Swim time: " + swimTime + " min." );
			Thread.sleep(600);
			currentTemperature -= 0.5;
			System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

		} while ( currentTemperature >= minimumTemperature );

		System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
	}
}
//1.Goofus and Gallant swim the same amount of time.
//2.Gallant doesn't swim at all and Goofus swims for 1 min. 
//3.Gallant checks the water first. 
//4.Goofus just dives right in the water.  
//5.A while loop check the condition first before executing the content. Do-while loop executes the content once before checking the condition. 
//6.While loop is a pre-test loop, do-while loop is a post-test loop. 
 