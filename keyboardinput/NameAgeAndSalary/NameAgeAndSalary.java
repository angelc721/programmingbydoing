//Keyboard input Name,Age, and Salary 15pts Angel Chuang
import java.util.Scanner;

public class NameAgeAndSalary
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println( "Hello. What is your name?");
        String name = keyboard.next();
        System.out.println("Hi," + name+  " How old are you?");
        int age = keyboard.nextInt();
        System.out.println( "So you're " + age + ", eh? That's not old at all!");
        System.out.println( "How much do you make, " + name + "?");
        int wage = keyboard.nextInt();
        System.out.println( wage + "! I hope that's per hour and not per year! LOL! ");
    }
}
