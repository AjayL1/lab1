package lab6;

import java.util.*;

public class NumberSquare {
	public static HashMap method(int[] array) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int n : array) {
			map.put(n, n * n);
		}
		return map;
	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 3, 5, 7, 9, 15, 20, 25 };
		HashMap<Integer, Integer> map = method(array);

		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " : " + map.get(key));
		}

	}

}
