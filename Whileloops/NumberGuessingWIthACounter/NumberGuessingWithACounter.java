//While loops Number Guessing with a Counter 40 pts Angel Chuang
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingWithACounter 
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int x=1+r.nextInt(10);
        System.out.println("I'm thinking of a number from 1 to 10. Try to guess it. ");
        int tries = 1;
        System.out.print("Your guess: ");
        int guess = keyboard.nextInt();
        while (guess!=x)
        {
            if (guess!=x)
            {
                System.out.println("The is incorrect. Guess again. ");
                System.out.print("Your guess: ");
                guess = keyboard.nextInt();
                tries++;
            }
        }
        System.out.println("That's right! You're a good guesser! ");
        System.out.println("It only took you " +tries+" tries.");
    }
}