//Basic Records 80 pts Angel Chuang
import java.util.*;
class Students
{
    String name;
    int grade;
    double average; 
}
public class BasicRecords
{
    public static void main (String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        Students one = new Students();
        Students two = new Students();
        Students three = new Students();
        
        System.out.print("Enter the first student's name: ");
		one.name = keyboard.next();
		System.out.print("Enter the first student's grade: ");
		one.grade = keyboard.nextInt();
        System.out.print("Enter the first student's average: ");
        one.average = keyboard.nextDouble();
        System.out.println(); 
        System.out.print("Enter the second student's name: ");
		two.name = keyboard.next();
		System.out.print("Enter the second student's grade: ");
		two.grade = keyboard.nextInt();
        System.out.print("Enter the second student's average: ");
        two.average = keyboard.nextDouble();
        System.out.println(); 
        System.out.print("Enter the third student's name: ");
		three.name = keyboard.next();
		System.out.print("Enter the third student's grade: ");
		three.grade = keyboard.nextInt();
        System.out.print("Enter the third student's average: ");
        three.average = keyboard.nextDouble();
        System.out.println(; 

        System.out.println("The names are: "+one.name+" "+two.name+" "+three.name);
		System.out.println("The grades are: "+one.grade+" "+two.grade+" "+three.grade);
		System.out.println("The averages are: "+one.avg+" "+two.avg+" "+s_three.avg);
		System.out.println();
        System.out.println("")
    }
}
