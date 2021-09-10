//if statements part 2 Two More Questions 35 pts Angel Chuang
import java.util.Scanner;
public class TwoMoreQuestions
{
    public static void main ( String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String answer = "";
        String answer1 = "";
        System.out.println("TWO MORE QUESTIONS, BABY!");
        System.out.println();
        System.out.println("Think of something and I'll try to guess it!");
        System.out.println();
        System.out.print("Question 1) Does it stay inside or outside or both? ");
        answer=keyboard.next();
        System.out.print("Question 2) Is it a living thing? ");
        answer1=keyboard.next();

        if( answer.equals("inside") && answer1.equals("yes"))
        {
            System.out.println("Then what else could you be thinking of besides a houseplant?!?");
        }
        if( answer.equals("inside") && answer1.equals("no"))
        {
            System.out.println("Then what else could you be thinking of besides a shower curtain?!?");
        }
        if( answer.equals("outside") && answer1.equals("yes"))
        {
            System.out.println("Then what else could you be thinking of besides a bison?!?");
        }
        if( answer.equals("outside") && answer1.equals("no"))
        {
            System.out.println("Then what else could you be thinking of besides a billiboare?!?");
        }
        if( answer.equals("both") && answer1.equals("yes"))
        {
            System.out.println("Then what else could you be thinking of besides a dog?!?");
        }
        if( answer.equals("both") && answer1.equals("no"))
        {
            System.out.println("Then what else could you be thinking of besides a cell phone?!?");
        }
    }
}