import javax.swing.JFrame;

public class ClockViewer {
	public static void main(String[] args) {
		JFrame frame = new JFrame();

		frame.setSize(900, 500);
		frame.setTitle("My Clocks");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ClockComponent component = new ClockComponent();
		frame.add(component);

		frame.setVisible(true);
	}
}