package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondMainUsingComparable {
    public static void main(String[] args) {
        List<SecondEmployee> listEmployees = new ArrayList<>();
        SecondEmployee emp1 = new SecondEmployee(1, "Tom", "Verkov", 32500, "Manager", 4);
        SecondEmployee emp2 = new SecondEmployee(2, "Ivan", "Ivanov", 55250, "Main Manager", 7);
        SecondEmployee emp3 = new SecondEmployee(3, "Sarah", "Bora", 40000, "Communication operator", 6);
        SecondEmployee emp4 = new SecondEmployee(4, "Alex", "Samver", 70450, "Marketing Director", 9);
        SecondEmployee emp5 = new SecondEmployee(5, "Tom", "Volkov", 35000, "Manager", 4);
        SecondEmployee emp6 = new SecondEmployee(6, "Ivan", "Norbit", 52650, "Main Manager", 7);
        SecondEmployee emp7 = new SecondEmployee(7, "Sarah", "Scot", 45230, "Communication operator", 6);
        SecondEmployee emp8 = new SecondEmployee(8, "Alex", "Magad", 70450, "Marketing Director", 9);
        SecondEmployee emp9 = new SecondEmployee(9, "Sarah", "Scotich", 39090, "Communication operator", 6);

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
        Collections.sort(listEmployees);
        System.out.println("Sorted Employees:" + listEmployees);
    }

}
