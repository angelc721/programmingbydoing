//Arraylists There or Not 85 pts Angel Chuang
import java.util.*;
public class ThereOrNot
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        ArrayList<Integer> list0 = new ArrayList<Integer>(); 
        Scanner input = new Scanner(System.in); 
        for (int i=0; i<10; i++)
        {
            list0.add(1+generator.nextInt(50));
        }
        System.out.print("ArrayList: "+list0); 
        System.out.println(); 
        System.out.print("Value to find: ");
        int x = input.nextInt(); 
        if(list0.contains(x))
            {
                System.out.print(x+" is in the ArrayList."); 
            }
        else
            {
                System.out.print(x+" is not in the ArrayList."); 
            }
    }
}