package stuff;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;
public class SmileyFace extends JFrame{
	public SmileyFace()
	{
        setTitle("SmileyFace");
        setSize(640,480);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.drawOval(150, 50, 300, 300);
        g.fillOval(150, 50, 300, 300);
        g.setColor(Color.BLUE);
        g.fillOval(250, 100, 50, 50);
        g.fillOval(350, 100, 50, 50);
        g.setColor(Color.BLACK);
        g.drawLine(325, 150, 325, 200);
        g.drawArc(275, 250, 100, 50, 0, -150);
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       	SmileyFace t = new SmileyFace();
        t.paint(null);
    }
}
