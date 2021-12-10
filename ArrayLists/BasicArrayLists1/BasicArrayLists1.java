//Array Lists Basic Array Lists 1 30 pts Angel Chuang
import java.util.*;
public class BasicArrayLists1
{
    public static void main(String[] args)
    {
        List<String> listTest = new ArrayList<String>();
        listTest.add("-113");
        for (int i=0; i<10; i++)
        {
            System.out.println("Slot "+i+" contains a "+listTest.get(0)); 
        }
    }
}