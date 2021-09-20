//While loops Counting with a While loop 30 pts Angel Chuang
import java.util.Scanner;

public class CountingWhile
{
    public static void main( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println( "Type in a message, and I'll display it five times.");
        System.out.print("Message: ");
        String message = keyboard.nextLine();
        System.out.print("How many times? ");
        int times = keyboard.nextInt();

        int n = 1;
        while (n<=times)
        {
            System.out.println((n*10) + ". " + message);
            n++ //increments the value and returns the old one 
        }
    }
}