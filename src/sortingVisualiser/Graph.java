package sortingVisualiser;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Graph {
	private ArrayList<Integer> list;
	
	public Graph(int size) {
		this.list = new ArrayList<Integer>();
		ArrayList<Integer> selection = new ArrayList<Integer>();
		int min = 1;
		int max = size;
		
		for (int i = 1;i < max+1;i++) {
			selection.add(i);
		}
		
		for (int i=0;i<50;i++) {
			int randomNum = ThreadLocalRandom.current().nextInt(min-1, max);
			this.list.add(selection.get(randomNum));
			selection.remove(randomNum);
			max -=1;
		}
		
	}
	
	public ArrayList<Integer> getGraph(){
		return list;
		// ok
	}
	
}
