//Random numbers Dice 25pts Angel Chuang 
import java.util.Random;

public class Dice
{
    public static void main (String[] args)
    {
        System.out.println("HERE COMES THE DICE!");
        System.out.println();
        Random r = new Random();
        int x = 1+r.nextInt(6);

        int roll1 = 1+r.nextInt(6);
        System.out.println("Roll #1: "+roll1);
        int roll2 = 1+r.nextInt(6);
        System.out.println("Roll #2: "+roll2);
        int sum = roll1 + roll2; 
        System.out.println("The total is "+sum+"!");

    }
}