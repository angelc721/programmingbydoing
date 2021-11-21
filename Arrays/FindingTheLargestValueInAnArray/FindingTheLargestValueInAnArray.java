//Array Finding the largest value in an array 100 pts Angel Chuang
import java.util.*;
import java.io.*;
public class FindingTheLargestValueInAnArray
{
    public static void main (String[] args)
    {
        Random r = new Random();
        int a[] = new int[10];
        int largest = 0;
        System.out.print("Array: ");
        for (int i=0; i<a.length; i++)
        {
            a[i] = r.nextInt(50);
            System.out.print(a[i]+ " ");
        }
        for(int i=0; i<a.length; i++)
        {
            if(largest<a[i])
            {
                largest = a[i]; 
            }
        }
        System.out.println();
        System.out.println("The largest value is "+largest+"."); 
    }
}