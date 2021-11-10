//Graphics A Smiling Face 40 pts Angel Chuang 
import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.drawOval(250,150,350,320);
        g.fillOval(250,150,350,320);

        g.setColor(Color.blue);
        g.fillOval(300, 220, 90, 100);
        g.fillOval(450, 220, 90, 100);

        g.setColor(Color.red);
        g.drawArc(350,300,150,100,0,-180); 
    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame("A Smiling Face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add( canvas );
        win.setVisible(true);
    }
}