import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapStringCountOrder {

    public static void main(String[] args) {

        TreeMapStringCountOrder.aa("chowdhury");


    }

    public static void aa(String ac) {

        TreeMap<Character, Integer> countString = new TreeMap<Character, Integer>();

        char[] a = ac.toCharArray();

        Arrays.sort(a);


        for (int i = 0; i < a.length; i++) {

            if (countString.containsKey(a[i])) {
                countString.put(a[i], countString.get(a[i]) + 1);
            } else {
                countString.put(a[i], 1);
            }

        }

        for (Map.Entry m : countString.entrySet()) {

            System.out.println(m.getKey() + " " + m.getValue());
        }


    }


}
