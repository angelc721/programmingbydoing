//Records A Little Database 100 pts Angel Chuang 
import java.util.*;
class Student
{
    String name;
    int grade;
    double avg; 
}
public class LilDatabase 
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in); 
        Student a[] = new Student[3]; 
    
        a[0] = new Student(); 
        System.out.print("Enter the first student's name: ");
        a[0].name = keyboard.next();
        System.out.print("Enter the first student's grade: "); 
        a[0].grade = keyboard.nextInt(); 
        System.out.print("Enter the first student's average: "); 
        a[0].avg = keyboard.nextDouble(); 
        System.out.println(); 

        a[1] = new Student(); 
        System.out.print("Enter the second student's name: ");
        a[1].name = keyboard.next();
        System.out.print("Enter the second student's grade: "); 
        a[1].grade = keyboard.nextInt(); 
        System.out.print("Enter the second student's average: "); 
        a[1].avg = keyboard.nextDouble(); 
        System.out.println(); 

        a[2] = new Student(); 
        System.out.print("Enter the third student's name: ");
        a[2].name = keyboard.next();
        System.out.print("Enter the third student's grade: "); 
        a[2].grade = keyboard.nextInt(); 
        System.out.print("Enter the third student's average: "); 
        a[2].avg = keyboard.nextDouble(); 
        System.out.println(); 

        System.out.println("The names are: "+a[0].name+" "+a[1].name+" "+a[2].name); 
        System.out.println("The grades are: "+a[0].grade+" "+a[1].grade+" "+a[2].grade);
        System.out.println("The averages are: "+a[0].avg+" "+a[1].avg+" "+a[2].avg); 
    }
}

