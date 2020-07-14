import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArraylistRemoveDuplicate {
	public static void main(String[] args) {
		List<Integer> s = new ArrayList<>();
		Set<Integer> set = new HashSet<>();

		s.add(1);
		s.add(2);
		s.add(3);
		s.add(1);

		set.addAll(s);
		s.clear();
		s.addAll(set);
		System.out.println(s);

	}
}
