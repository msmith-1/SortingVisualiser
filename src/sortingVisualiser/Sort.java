package sortingVisualiser;

import java.util.ArrayList;
import javax.swing.JFrame;

public class Sort {
		
	public static void main(String[] args) {
		UI app = new UI();
		JFrame frame = new JFrame("Sorting Visualiser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,400);
		frame.setLocationRelativeTo(null);
		frame.add(app);
		frame.setVisible(true);	
	}
}
