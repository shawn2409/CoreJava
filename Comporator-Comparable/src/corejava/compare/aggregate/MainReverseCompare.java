package corejava.compare.aggregate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainReverseCompare {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Shawn", 25, new Address("dallas", "texas")));
        employees.add(new Employee("Jon", 35, new Address("fort worth", "Bacon")));
        employees.add(new Employee("Don", 11, new Address("allen", "Jimbo")));
        Collections.sort(employees,new CompareByEmployeeAddress());

        Collections.reverse(employees);

        for(Employee e:employees){
            System.out.println(e.address.getCity());
        }

    }
    }
