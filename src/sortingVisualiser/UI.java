package sortingVisualiser;

import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI extends JPanel implements ActionListener{
	
	private JComboBox<String> algs;
	private JButton run;
	
	private VisualGraph graph;
	private GraphModel model;
	
	
	public UI() {
		this.graph = new VisualGraph();
		this.model = graph.getModel();
		
		algs = new JComboBox<String>(new String[]{"Insertion", "Selection"});
		run = new JButton("Sort");
		add(algs);
		add(run);
		
		run.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		graph.sortModel();
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		graph.draw(g);
	}
	
}
