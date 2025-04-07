import java.awt.*;
import javax.swing.*;

public class bresenhams extends JPanel {
    private int x1, y1, x2, y2;

    public bresenhams(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawLine(g, x1, y1, x2, y2);
    }

    private void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int pk = 2*dy - dx;
        while(true) {
        	int temp = 0;
    		if(x1>x2) {
    			temp = x1;
    			x1=x2;
    			x2 = temp;
    		}
    		if(y1>y2) {
    			temp = y1;
    			y1 = y2;
    			y2 = temp;
    		}
        	g.drawLine(x1, y1, x1, y1);
        	if (x1 == x2 && y1 == y2) break;
        	if(pk<0) {
        		
        		pk = pk + 2*dy;
        		x1++;
        	}
        	if(pk>0) {
        		pk = pk + 2*dy - 2*dx;
        		x1++;
        		y1++;
        	}
        }
        


    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bresenham's Line");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(new bresenhams(50, 250, 300, 200)); // Example line
        frame.setVisible(true);
    }
}