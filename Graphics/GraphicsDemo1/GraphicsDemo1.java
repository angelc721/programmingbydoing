//Graphics Graphic Demo 1 20 pts Angel Chuang
import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(50,20,100,200);  // draw a rectangle
        g.fillOval(160,20,100,200); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.drawRect(600,430,100,100);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
    }
}
//1. The window is 800 pixel wide and 600 pixel tall. 
//2. the x coordinate, the y coordinate, the width, and the height of the rectangle to be drawn.
//3. the x coordinate of the upper left corner, the y coordinate of the upper left corner, the width, and the height of the oval to be filled.
//4. The x coordinate and the y coordinate. 
//5. When the Oval has greater size than the rectangle than the oval will be drawn on top. 

