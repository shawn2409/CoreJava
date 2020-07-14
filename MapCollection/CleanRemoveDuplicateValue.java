import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CleanRemoveDuplicateValue {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Anil");
        hm.put(2, "Deven");
        hm.put(3, "sanjay");
        hm.put(4, "sanjay");
        hm.put(5, "Raj");
        hm.put(6, "sanjay");

		Set<String> hm2 = new TreeSet<String>();
        hm2.addAll(hm.values());

        for (String str : hm2){
            System.out.println(str);
        }
    }

}