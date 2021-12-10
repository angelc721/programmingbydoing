//Arraylists Finding a value in an arraylist 80 pts Angel Chuang
import java.util.*;
public class FindingAValueInAnArrayList
{
    public static void main (String[] args)
    {
        Random generator = new Random();
        ArrayList<Integer> mylist = new ArrayList<Integer>(); 
        Scanner input = new Scanner(System.in); 
        for (int i=0; i<10; i++)
        {
            mylist.add(1+generator.nextInt(50));
        }
        System.out.print("ArrayList: "+mylist); 
        System.out.println(); 
        System.out.print("Value to find: ");
        int x = input.nextInt(); 
        for (Integer i: mylist)
        {
            if(x==i)
            {
                System.out.print(x+" is in the ArrayList."); 
            }
        }
    }
    
}
