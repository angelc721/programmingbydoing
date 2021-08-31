//Keyboard input Age in Five Years 18 pts Angel Chuang
import java.util.Scanner;

public class AgeInFiveYears
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello. What is your name? ");
        String name = keyboard.next();
        System.out.println(" ");
        System.out.print("Hi, " + name + "! How old are you? ");
        int age = keyboard.nextInt();
        System.out.println(" ");
        int after = age+5;
        int before = age-5;
        System.out.println("Did you know that in five years your will be " +after+ " years old?");
        System.out.println("And five years ago you were " + before +"! Imagine that!");
    }
}