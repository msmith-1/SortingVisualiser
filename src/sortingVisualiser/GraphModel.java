package sortingVisualiser;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

public class GraphModel {
	
	public static class GraphItem {
		private int height;
		private int width;
		private Color background;
		
		public GraphItem(int height) {
			this.height = (600/100) * height;
			this.background = new Color(100,100,100);
		}
		
		public void setColour(Color c) {
			this.background = c;
		}
		
		public int getHeight() {
			return height;
		}
		
		public int getWidth() {
			return width;
		}
		
		public Color getColour() {
			return background;
		}

	}
	
	public static final int DEFAULT_ITEM_WIDTH = 20;
	
	public ArrayList<GraphItem> items = new ArrayList<GraphItem>();
	public Point location = new Point();
	public Dimension size = new Dimension();
	public static final int GAP = 2;
	
	public GraphModel() {
		
	}
	
	public void setSize(int width, int height) {
		size.width = width;
		size.height = height;
	}	
	
	public void setLocation(int x, int y) {
		this.location.x = x;
		this.location.y = y;
	}
	
	public void addItem(GraphItem item) {
		items.add(item);
	}
	
	public GraphItem itemAt(int index) {
		return items.get(index);
	}
	
	public GraphItem removeItemAt(int index) {
		return items.remove(index);
	}
	
	public int getX() {
		return location.x;
	}
	
	public int getY() {
		return location.y;
	}
	
	public int getGap() {
		return GAP;
	}
	
}
