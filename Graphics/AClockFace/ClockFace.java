//Graphics A Clock Face 70 pts Angel Chuang 
import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
    public void paint (Graphics g)
    {
        g.setColor(Color.black);
        g.drawOval(200,150,300,300);
        g.setFont(new Font("Consolos", Font.BOLD, 20));
        g.drawString("12", 340, 170);
        g.drawString("3", 480, 300); 
        g.drawString("6", 345, 440);
        g.drawString("9", 210, 300);
        g.setColor(Color.gray);
        g.fillOval(345,290,10,10); 
        g.setColor(Color.black);
        g.drawLine(205,295,350,295);
        g.drawLine(260,350,350,295); 
    }
    public static void main(String[] args)
    {
        JFrame win = new JFrame("A Clock Face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockFace canvas = new ClockFace();
        win.add( canvas );
        win.setVisible(true);
    }
}
