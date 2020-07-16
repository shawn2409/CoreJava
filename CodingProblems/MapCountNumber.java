import java.util.HashMap;
import java.util.Map;

public class MapCountNumber {

	public static void main(String[] args) {

		Map<Integer, Integer> h = new HashMap<Integer, Integer>();

		int[] arr = new int[] { 1, 2, 2, 4, 3, 4, 5, 4, 3 };

		for (int i = 0; i < arr.length; i++) {

			if (h.containsKey(arr[i])) {
				h.put(arr[i], h.get(arr[i]) + 1);
			} else {
				h.put(arr[i], 1);
			}

		}
		for (Map.Entry e : h.entrySet()) {
			System.out.println(e.getKey() + " " + e.getValue());
		}

	}

}
