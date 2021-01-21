import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

/**
 * This class is used to represent a clock which can be placed anywhere on the
 * screen.
 */
public class Clock {

	private final int size = 200;
	private final int spacing = 100;

	private int left;
	private int top;

	/**
	 * Parameterized Constructor
	 * 
	 * @param x the x-coordinate
	 * @param y the y-coordinate
	 */
	public Clock(int left, int top) {
		this.left = left;
		this.top = top;
	}

	/**
	 * This method is used to draw the clock.
	 * 
	 * @param g the graphics context
	 */
	public void draw(Graphics2D g) {

		g.setFont(new Font("TimesRoman", Font.PLAIN, 18));
		g.drawString("The time on the clock is 3:30", 300, 50);

		Ellipse2D.Double circle = new Ellipse2D.Double(left + spacing, top + spacing, size, size);
		g.setPaint(Color.ORANGE);
		g.setStroke(new BasicStroke(15));
		g.draw(circle);
		g.setColor(Color.WHITE);
		g.fill(circle);

		g.setColor(Color.BLACK);
		g.setStroke(new BasicStroke(3));
		Rectangle minuteHand = new Rectangle((left + spacing + (size / 2) - 5), (top + spacing + (size / 2)), 60, 3);
		Rectangle hourHand = new Rectangle((left + spacing + (size / 2)), (top + spacing + (size / 2) - 5), 3, 70);
		g.draw(minuteHand);
		g.fill(minuteHand);
		g.setStroke(new BasicStroke(2));
		g.draw(hourHand);
		g.fill(hourHand);

		Line2D.Double piece1 = new Line2D.Double(new Point2D.Double((left + spacing + (size / 2)), (top + spacing + 5)),
				new Point2D.Double((left + spacing + (size / 2)), (top + spacing + 20)));
		Line2D.Double piece2 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) + 50), (top + spacing + 20)),
				new Point2D.Double((left + spacing + (size / 2) + 40), (top + spacing + 35)));
		Line2D.Double piece3 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) + 85), (top + spacing + 60)),
				new Point2D.Double((left + spacing + (size / 2) + 70), (top + spacing + 70)));
		Line2D.Double piece4 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) + 95), (top + spacing + 100)),
				new Point2D.Double((left + spacing + (size / 2) + 80), (top + spacing + 100)));
		Line2D.Double piece5 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) + 85), (top + spacing + 145)),
				new Point2D.Double((left + spacing + (size / 2) + 70), (top + spacing + 140)));
		Line2D.Double piece6 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) + 55), (top + spacing + 180)),
				new Point2D.Double((left + spacing + (size / 2) + 45), (top + spacing + 170)));
		Line2D.Double piece7 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2)), (top + spacing + 195)),
				new Point2D.Double((left + spacing + (size / 2)), (top + spacing + 180)));
		Line2D.Double piece8 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) - 55), (top + spacing + 180)),
				new Point2D.Double((left + spacing + (size / 2) - 45), (top + spacing + 170)));
		Line2D.Double piece9 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) - 85), (top + spacing + 145)),
				new Point2D.Double((left + spacing + (size / 2) - 70), (top + spacing + 140)));
		Line2D.Double piece10 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) - 95), (top + spacing + 100)),
				new Point2D.Double((left + spacing + (size / 2) - 80), (top + spacing + 100)));
		g.setStroke(new BasicStroke(4));
		Line2D.Double piece11 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) - 85), (top + spacing + 60)),
				new Point2D.Double((left + spacing + (size / 2) - 70), (top + spacing + 70)));
		Line2D.Double piece12 = new Line2D.Double(
				new Point2D.Double((left + spacing + (size / 2) - 50), (top + spacing + 20)),
				new Point2D.Double((left + spacing + (size / 2) - 40), (top + spacing + 35)));

		g.setStroke(new BasicStroke(5));
		g.setPaint(Color.LIGHT_GRAY);
		g.draw(piece1);
		g.draw(piece2);
		g.draw(piece3);
		g.draw(piece4);
		g.draw(piece5);
		g.draw(piece6);
		g.draw(piece7);
		g.draw(piece8);
		g.draw(piece9);
		g.draw(piece10);
		g.draw(piece11);
		g.draw(piece12);

	}
}