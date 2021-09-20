//While Loop Enter Your PIN 15pts ANgel Chuang
import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		int pin = 12345;

		System.out.println("WELCOME TO THE BANK OF MITCHELL.");
		System.out.print("ENTER YOUR PIN: ");
		int entry = keyboard.nextInt();

		while ( entry != pin )   
		{
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();  //There isn't an Int in front of this line because the while statement looks above to find established variables.
            //if this line is deleted the compiling fails, because it can't navigate back to the original entry variable.
		}

		System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
	}
}

//While loop is similar to if statement because both of them are conditional, they only work when the requirements are true.
//While loop is different from if statement because it does things as long as the conditional is true (looping), but if statement perform the operation only once if the condition is true.  
