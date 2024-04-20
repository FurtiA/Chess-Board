package Appletshtml1;
import java.applet.*;
import java.awt.*;
import static javax.management.Query.lt;

public class CheesBoard1 extends Applet {
    static int N = 10;
    public void paint(Graphics g)
    {
        int x, y;
        int row,col;
        for ( row = 0;  row <= N; row++) {
 
            for ( col = 0; col <= N; col++) {
                x = row * 20;
 
                y = col * 20;
 
                if ((row % 2 == 0) == (col % 2 == 0))
                    g.setColor(Color.BLACK);
                else
                    g.setColor(Color.WHITE);
 
                g.fillRect(x, y, 20, 20);
            }
        }
    }
}
