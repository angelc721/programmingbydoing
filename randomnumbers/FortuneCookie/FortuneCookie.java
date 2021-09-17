//Random numbers fortune cookie 25 pts Angel Chuang 
import java.util.Random;

public class FortuneCookie
{
    public static void main (String[] args)
    {
        Random r = new Random();
        int x = 1+r.nextInt(6);
        int y1 = 1+r.nextInt(54);
        int y2 = 1+r.nextInt(54);
        int y3 = 1+r.nextInt(54);
        int y4 = 1+r.nextInt(54);
        int y5 = 1+r.nextInt(54);
        int y6 = 1+r.nextInt(54);

        System.out.print("Fortune cookie says: ");
        if (x==1)
        {
            System.out.println("\"You will find happiness with a new love.\"");
            System.out.println(" - "+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6+" - ");
        }
        if (x==2)
        {
            System.out.println("\"Your road to glory will be rocky, but fulfilling.\"");
            System.out.println(" - "+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6+" - ");
        }
        if (x==3)
        {
            System.out.println("\"Nothing is impossible to a willing heart.\"");
            System.out.println(" - "+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6+" - ");
        }
        if (x==4)
        {
            System.out.println("\"You will win and succeed.\"");
            System.out.println(" - "+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6+" - ");
        }
        if (x==5)
        {
            System.out.println("\"Be careful or you could fall for some tricks today.\"");
            System.out.println(" - "+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6+" - ");
        }
        if (x==6)
        {
            System.out.println("\"Congratulations! You are on your way.\"");
            System.out.println(" - "+y1+" - "+y2+" - "+y3+" - "+y4+" - "+y5+" - "+y6+" - ");
        }
    }
}