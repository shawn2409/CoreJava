import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapIterationSetAllType {

    public static void main(String[] args) {

        Map<Integer, String> integerStringMap = new TreeMap<Integer, String>();
        integerStringMap.put(1, "One");
        integerStringMap.put(2, "Two");
        integerStringMap.put(3, "One");
        integerStringMap.put(4, "Three");
        integerStringMap.put(5, "Two");
        integerStringMap.put(6, "Three");

        Set<String> set1 = new HashSet<>();

        Set set = integerStringMap.entrySet();

        Iterator i = set1.iterator();
        while (i.hasNext()) {
            Map.Entry m = (Entry) i.next();
            String s = (String) m.getValue();

        }


        Iterator<Map.Entry<Integer, String>> itr = integerStringMap.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }

        for (Map.Entry m : integerStringMap.entrySet()) {
            System.out.println(m.getKey());
        }


    }
}