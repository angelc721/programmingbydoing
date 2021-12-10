//Arraylists Copying ArrayLists 55 pts Angel Chuang 
import java.util.*;
public class CopyingArrayLists
{
    public static void main (String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<Integer>(); 
        for(int i=0; i<=10; i++)
        {
            list1.add(getNumbers()); 
        }
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.addAll(list1); 
        list1.set(list1.size()-1,-7); 
        System.out.print("Arraylist 1: "+ list1); 
        System.out.println();
        System.out.print("Arraylist 2: "+ list2); 
    }

    public static int getNumbers()
    {
        Random r = new Random(); 
        int x = 1+r.nextInt(100); 
        return x; 
    }
}