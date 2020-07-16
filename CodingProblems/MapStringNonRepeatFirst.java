import java.util.HashMap;
import java.util.Map;

public class MapStringNonRepeatFirst {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        char[] c = str.toCharArray();

        HashMap<Character, Integer> s = new HashMap<>();

		System.out.println(s.containsKey(c[0]));

        for (int i = 0; i < c.length; i++) {

            if (s.containsKey(c[i])) {
				System.out.println(s.containsKey(c[i]));
                s.put(c[i], s.get(c[i]) + 1);
            } else {
                s.put(c[i], 1);
            }

        }

        for (int i = 0; i < c.length; i++) {

            if (s.get(c[i]) > 1) {

                System.out.println(c[i]);
                break;
            }

        }
    }

}
