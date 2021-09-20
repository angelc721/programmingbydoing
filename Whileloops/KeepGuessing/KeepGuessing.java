//While loop Keep Guessing 50 pts Angel Chuang
import java.util.Scanner;
import java.util.Random;
public class KeepGuessing
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int x=1+r.nextInt(10);
        System.out.println("I'm thinking of a number from 1 to 10.");
        int guess = keyboard.nextInt();
        while (guess!=x)
        {
            System.out.print("Your guess: ");
            guess = keyboard.nextInt();
        }
        if (guess == x)
        {
            System.out.println("That's right, you're a good guesser.");
        }
        else
        {
            System.out.println("That is incorrect. Guess again.");
        }
    }
}