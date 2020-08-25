package sortingVisualiser;

import java.util.ArrayList;

public class Insertion {
	
	public static ArrayList<Integer> insertionSort(ArrayList<Integer> list) {

		int key;
		int j;

		for (int i = 1; i < list.size(); i++) {
			key = list.get(i);
			j = i - 1;

			while (j >= 0 && list.get(j) > key) {
				list.set(j + 1, list.get(j));
				j -= 1;
			}

			list.set(j + 1, key);
		}

		return list;

	}

}
