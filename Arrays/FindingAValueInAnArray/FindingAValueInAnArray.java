//Array Finding a value in an array 80 pts Angel Chuang
import java.util.*;
public class FindingAValueInAnArray
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int a[] = new int[10];
        Random r = new Random();
        System.out.print("Array: ");
        for (int i=0; i<a.length; i++)
        {
            a[i] = 1+r.nextInt(50);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Value to find: ");
        int choice = keyboard.nextInt();
        System.out.println(); 
        for (int i=0; i<a.length; i++)
        {
            if (a[i] == choice)
            {
                System.out.println(choice + " is in the array"); 
            }
        }
    }
}