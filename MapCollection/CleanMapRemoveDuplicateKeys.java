import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class CleanMapRemoveDuplicateKeys {
	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Anil");
		hm.put(2, "Deven");
		hm.put(3, "sanjay");
		hm.put(4, "sanjay");
		hm.put(5, "Raj");
		hm.put(5, "sanjay");

		Set<Entry<Integer, String>> hm2 = hm.entrySet();

		Iterator<Entry<Integer, String>> m = hm2.iterator();
		while (m.hasNext()) {
			Map.Entry m2 = m.next();
			System.out.println(m2.getKey() + " " + m2.getValue());

		}

	}
}
