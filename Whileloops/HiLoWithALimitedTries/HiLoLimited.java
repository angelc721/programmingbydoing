//While loops Hi-Lo with limited tries 55 pts Angel Chuang
import java.util.Scanner;
import java.util.Random;
public class HiLoLimited
{
    public static void main (String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        Random r = new Random();
        int x = 1+r.nextInt(100);
        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        System.out.print("First guess: ");
        int guess = keyboard.nextInt();
        int tries = 1;
        while (x!=guess && tries<7)
        {
            if (guess>x)
            {
                System.out.println("Sorry, you are too high.");
            }
            if (guess<x)
            {
                System.out.println("Sorry, you are too low.");
            }
            tries++;
            System.out.print("Guess #"+tries+": ");
            guess = keyboard.nextInt();
        }
        if (x!=guess)
        {
            System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
        }
        if (x==guess)
        {
            System.out.println("Wow, you got it in only " + tries + " tries! What are the odds?!?");
        }

    }
}