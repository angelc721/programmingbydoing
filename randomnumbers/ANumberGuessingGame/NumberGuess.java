//Random numbers A number guessing game 20 pts Angel Chuang 
import java.util.Random;
import java.util.Scanner;

public class NumberGuess 
{
    public static void main ( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int x=1+r.nextInt(10);

        System.out.println("I'm thinking of a number from 1 to 10.");
        System.out.print("Your guess: ");
        int guess = keyboard.nextInt();
        System.out.println();
        if (guess == x)
        {
            System.out.println("That's right, my secret number is " +x+"!");
        }
        else
        {
            System.out.println("Sorry, but I was really thinking of " +x+".");
        }

    }
}