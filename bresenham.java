import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class bresenham extends JPanel {
    public void paint(Graphics g) {
        drawLine(g, 50, 50, 200, 150); // Example Line
    }

    public void drawLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        int d = 2 * dy - dx; 
        int y = y1;
        
        for (int x = x1; x <= x2; x++) {
            g.fillRect(x, y, 1, 1); // Plot pixel
            
            if (d > 0) {
                y++;
                d += 2 * (dy - dx);
            } else {
                d += 2 * dy;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        bresenham panel = new bresenham();
        
        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
