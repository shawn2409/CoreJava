import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExampleForWhile {

	public static void main(String[] args) {

		Map<Integer, String> app = new HashMap<>();
		app.put(1, "shawn");
		app.put(2, "shawn");
		app.put(3, "akil");
		app.put(4, "jon");

		Set set = app.entrySet();

		Iterator it = set.iterator();
		while (it.hasNext()) {
			Map.Entry m = (Entry) it.next();

			System.out.println(m.getKey() + " " + m.getValue());
		}

		for (Map.Entry m : app.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
