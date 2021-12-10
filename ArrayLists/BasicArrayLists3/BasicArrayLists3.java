//Array Lists Basic ArrayLists 3 25 pts Angel Chuang 
import java.util.*;
public class BasicArrayLists3
{
    public static void main (String[] args)
    {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i=0; i<=1000; i++)
        {
            al.add(getNumbers()); 
        }
        System.out.print(al); 
    }
    static int getNumbers()
    {
		Random r = new Random();
		int x = r.nextInt(80)+10;
		return x;
	}
}