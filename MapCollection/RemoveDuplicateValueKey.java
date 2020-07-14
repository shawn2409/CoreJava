import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class RemoveDuplicateValueKey {

	public static void main(String[] args) {

		Map<String, String> myMap1 = new TreeMap<String, String>();
		myMap1.put("1", "One");
		myMap1.put("2", "Two");
		myMap1.put("3", "One");
		myMap1.put("4", "Three");
		myMap1.put("5", "Two");
		myMap1.put("6", "Three");

		Set<String> mySet = new HashSet<String>();

		for (Iterator itr = myMap1.entrySet().iterator(); itr.hasNext();) {
			Map.Entry<String, String> entrySet = (Map.Entry) itr.next();

			String value = entrySet.getValue();

			if (!mySet.add(value)) {
				itr.remove();
			}
		}

		Map<String, String> myMap2 = new TreeMap<String, String>(myMap1);

		for (Map.Entry m : myMap2.entrySet()) {

			System.out.println("Result " + m.getKey() + ":" + m.getValue());
		}
	}

}
