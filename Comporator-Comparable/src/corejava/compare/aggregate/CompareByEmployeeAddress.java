package corejava.compare.aggregate;

import java.util.Comparator;

public class CompareByEmployeeAddress implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.address.getCity().compareTo(o2.address.getCity());
    }
}
