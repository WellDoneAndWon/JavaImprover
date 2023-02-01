package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThirdMainUsingComparator {
    public static void main(String[] args) {
        List<ThirdEmployee> listEmployees = new ArrayList<>();
        ThirdEmployee emp1 = new ThirdEmployee(1, "Tom", "Verkov", 32500, "Manager", 4);
        ThirdEmployee emp2 = new ThirdEmployee(2, "Ivan", "Ivanov", 55250, "Main Manager", 7);
        ThirdEmployee emp3 = new ThirdEmployee(3, "Sarah", "Bora", 40000, "Communication operator", 6);
        ThirdEmployee emp4 = new ThirdEmployee(4, "Alex", "Samver", 70450, "Marketing Director", 9);
        ThirdEmployee emp5 = new ThirdEmployee(5, "Tom", "Volkov", 35000, "Manager", 4);
        ThirdEmployee emp6 = new ThirdEmployee(6, "Ivan", "Norbit", 52650, "Main Manager", 7);
        ThirdEmployee emp7 = new ThirdEmployee(7, "Sarah", "Scot", 45230, "Communication operator", 6);
        ThirdEmployee emp8 = new ThirdEmployee(8, "Alex", "Magad", 70450, "Marketing Director", 9);
        ThirdEmployee emp9 = new ThirdEmployee(9, "Sarah", "Scotich", 39090, "Communication operator", 6);

        listEmployees.add(emp1);
        listEmployees.add(emp2);
        listEmployees.add(emp3);
        listEmployees.add(emp4);
        listEmployees.add(emp5);
        listEmployees.add(emp6);
        listEmployees.add(emp7);
        listEmployees.add(emp8);
        listEmployees.add(emp9);
        System.out.println("Unsorted Employees:" + listEmployees);
        Collections.sort(listEmployees, new ThirdEmployee.NameComparator());
        System.out.println("Sorted Employees:" + listEmployees);
    }

}
