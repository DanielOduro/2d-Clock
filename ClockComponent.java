import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * This component is used to draw three clocks on the screen
 */
public class ClockComponent extends JComponent {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Clock clock1 = new Clock(0, 0);
		Clock clock2 = new Clock(250, 0);
		Clock clock3 = new Clock(500, 0);
		clock1.draw(g2);
		clock2.draw(g2);
		clock3.draw(g2);
	}
}