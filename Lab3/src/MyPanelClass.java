import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        //Draw a border
//                        g.setColor(Color.RED);
//                        g.drawRect(x1, y1, width, height);
//                        g.setColor(Color.BLUE);
//                        g.drawRect(x1 + 5, y1 + 5, width - 10, height - 10);
                        //Draw a line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        g.setColor(Color.YELLOW);
//                        g.drawLine(x1, y2, x2, y1);
                        //Draw an oval
//                       g.setColor(Color.GREEN);
//                        g.fillOval((x2/2)-(55/2), (y2/2)-(55/2), 55, 55);
                        //Draw Polygon 
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
//                        Polygon p2 = new Polygon();
//                        p2.addPoint(x1 + 25, y1 + 73);
//                        p2.addPoint(x1 + 41, y1 + 73);
//                        p2.addPoint(x1 + 47, y1 + 58);
//                        p2.addPoint(x1 + 53, y1 + 73);
//                        p2.addPoint(x1 + 69, y1 + 73);
//                        p2.addPoint(x1 + 56, y1 + 83);
//                        p2.addPoint(x1 + 61, y1 + 98);
//                        p2.addPoint(x1 + 47, y1 + 88);
//                        p2.addPoint(x1 + 34, y1 + 98);
//                        p2.addPoint(x1 + 38, y1 + 83);
//                        g.setColor(Color.WHITE);
//                        g.drawPolygon(p2);
                        
                          Polygon Flag1 = new Polygon();
                          Flag1.addPoint(x1, y1);
                          Flag1.addPoint(x1, y2/6);
                          Flag1.addPoint(x2, y2/6);
                          Flag1.addPoint(x2, y1);
                          g.setColor(Color.RED);
                          g.fillPolygon(Flag1);
                          
                          Polygon Flag2 = new Polygon();
                          Flag2.addPoint(x1, y2-(y2/6));
                          Flag2.addPoint(x2, y2-(y2/6));
                          Flag2.addPoint(x2, y2);
                          Flag2.addPoint(x1, y2);
                          g.setColor(Color.RED);
                          g.fillPolygon(Flag2);
                          
                          Polygon Flag3 = new Polygon();
                          Flag3.addPoint(x1, y2-2*y2/5);
                          Flag3.addPoint(x2, y2-2*y2/5);
                          Flag3.addPoint(x2, 2*y2/5);
                          Flag3.addPoint(x1, 2*y2/5);
                          g.setColor(Color.RED);
                          g.fillPolygon(Flag3);
                          
                          Polygon Triangulo = new Polygon();
                          Triangulo.addPoint(x1, y1);
                          Triangulo.addPoint(x1, y2);
                          Triangulo.addPoint(x2/2, y2-y2/2);
                          g.setColor(Color.BLUE);
                          g.fillPolygon(Triangulo);
                          
                          Polygon Star = new Polygon();
                        Star.addPoint(x1 + 90, y1 + 173);
                        Star.addPoint(x1 + 106, y1 + 173);
                        Star.addPoint(x1 + 112, y1 + 158);
                        Star.addPoint(x1 + 118, y1 + 173);
                        Star.addPoint(x1 + 134, y1 + 173);
                        Star.addPoint(x1 + 121, y1 + 183);
                        Star.addPoint(x1 + 126, y1 + 198);
                        Star.addPoint(x1 + 112, y1 + 188);
                        Star.addPoint(x1 + 99, y1 + 198);
                        Star.addPoint(x1 + 103, y1 + 183);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(Star);
            }
}