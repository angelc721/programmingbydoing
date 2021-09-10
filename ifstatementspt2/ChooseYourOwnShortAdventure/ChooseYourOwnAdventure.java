//if statements part 2 Choose Your Own Adventure 60 pts Angel Chuang
import java.util.Scanner;
public class ChooseYourOwnAdventure
{
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner (System.in);
        String answer = "";
        String answer1 = "";
        String answer2 = "";
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println();
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the");
        System.out.println("\"kitchen\"");
        System.out.print("> ");
        answer = keyboard.next();
        System.out.println( );
        if (answer.equals("kitchen"))
        {
            System.out.println("There is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the \"refrigerator\" or look in a \"cabinet\".");
            System.out.print("> ");
            answer1 = keyboard.next();
            System.out.println();
            if (answer1.equals("refrigerator"))
            {
                System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty.");
                System.out.println("Would you like to eat some of the food? (\"yes\" or \"no\")");
                System.out.print("> ");
                answer2 = keyboard.next();
                System.out.println();
                if (answer2.equals( "yes"))
                {
                    System.out.println("Here is a cake for you.");
                }
                else if (answer2.equals("no"))
                {
                    System.out.println("You die of starvation... eventually.");  
                }
            }
            else if (answer1.equals("cabinet"))
            {
                System.out.println("You are locked in the cabinet and die eventually.");
            }
        }
        if (answer.equals("upstairs"))
        {
            System.out.println("Upstairs you see a hallway. At the end of the hallway is the master \"bedroom\". There is also a \"bathroom\" off the hallway. Where would you like to go?");
            System.out.print("> ");
            answer1 = keyboard.next();
            System.out.println();
            if (answer1.equals("bedroom"))
            {
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. In the back of the room, the closet door is ajar.");
                System.out.println("Would you like to open the door? (\"yes\" or \"no\")");
                System.out.print("> ");
                answer2 = keyboard.next();
                System.out.println();
                if (answer2.equals("yes"))
                {
                    System.out.println("You find the treasure. You get 20 dollars.");
                    System.out.println("Thanks for playing, I'm tired of making nested if statements.");
                }
                else if (answer2.equals("no"))
                {
                    System.out.println("Well, then I guess you'll never know what was in there.");
                    System.out.println("Thanks for playing, I'm tired of making nested if statements.");
                }
            }
            else if (answer1.equals("bathroom"))
            {
                System.out.println("You are died of suffocation in the bathroom.");
            }
        }

    }
}