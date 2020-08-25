package sortingVisualiser;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class VisualGraph {
	public GraphModel model;
	public Graph list;
	
	public VisualGraph() {
		this.model = new GraphModel();
		this.list =  new Graph(50);
				
		model.setLocation(20, 50);
		model.setSize(400, 500);
		
		ArrayList<Integer> values = list.getGraph();
		
		for (int i = 0;i < values.size();i++) {
			GraphModel.GraphItem item = new GraphModel.GraphItem(values.get(i));
			model.addItem(item);
		}
		
	}
	
	public GraphModel getModel() {
		return model;
	}
	
	public void sortModel() {
		ArrayList<Integer> sorted = Insertion.insertionSort(list.getGraph());
		this.list =  new Graph(50);
		for (int i = 0;i < sorted.size();i++) {
			GraphModel.GraphItem item = new GraphModel.GraphItem(sorted.get(i));
			model.addItem(item);
		}
	}
	
	public void draw(Graphics g) {
		drawItems(g);
	}
	
	public void drawItems(Graphics g) {
		int i = 14;
		
		for (GraphModel.GraphItem item : model.items) {
			int x = i;
			int y = 350-item.getHeight();
			int w = 14;
			int h = item.getHeight();
			g.setColor(item.getColour());
			g.fillRect(x,y,w,h);
			g.setColor(new Color(255,255,255));
			g.drawRect(x,y,w,h);
			i+=14;
		}
		
	}
	
}
