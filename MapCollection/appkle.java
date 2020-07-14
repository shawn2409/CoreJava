import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class appkle {

	public static void main(String[] args) {

		Map<String, String> myMap1 = new TreeMap<String, String>();
		myMap1.put("1", "One");
		myMap1.put("2", "Two");
		myMap1.put("3", "One");
		myMap1.put("4", "Three");
		myMap1.put("5", "Two");
		myMap1.put("6", "Three");

		Set<String> set1 = new HashSet<>();

		Set set = myMap1.entrySet();

		Iterator i = set1.iterator();
		while (i.hasNext()) {
			Map.Entry m = (Entry) i.next();
			String s = (String) m.getValue();

		}

	}
}