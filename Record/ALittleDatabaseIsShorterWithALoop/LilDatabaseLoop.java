//Records A Little Database is shorter with a Loop 100 pts Angel Chuang 
import java.util.*; 
class Student
{
    String name;
    int grade;
    double avg; 
}
public class LilDatabaseLoop
{
    public static void main(String[] args)
    {
    Scanner keyboard = new Scanner(System.in);
    Student a[] = new Student[3];
    for(int i=0; i<a.length; i++) 
    {
        a[i] = new Student();
        System.out.print("Enter student "+(i+1)+"'s name: "); 
        a[i].name = keyboard.next();
        System.out.print("Enter student "+(i+1)+"'s grade: ");
        a[i].grade = keyboard.nextInt(); 
        System.out.print("Enter student "+(i+1)+"'s average: "); 
        a[i].avg = keyboard.nextDouble(); 
        System.out.println(); 
    }
    System.out.println("The names are: "+a[0].name+" "+a[1].name+" "+a[2].name);
	System.out.println("The grades are: "+a[0].grade+" "+a[1].grade+" "+a[2].grade);
	System.out.println("The averages are: "+a[0].avg+" "+a[1].avg+" "+a[2].avg);
	System.out.println();
    }
}