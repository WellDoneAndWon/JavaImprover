package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class second_mainUsingComparable {
    public static void main(String[] args) {
        List<second_Employee> listEmployees = new ArrayList<>();
        second_Employee emp1 = new second_Employee(1, "Tom", "Verkov", 32500, "Manager", 4);
        second_Employee emp2 = new second_Employee(2, "Ivan", "Ivanov", 55250, "Main Manager", 7);
        second_Employee emp3 = new second_Employee(3, "Sarah", "Bora", 40000, "Communication operator", 6);
        second_Employee emp4 = new second_Employee(4, "Alex", "Samver", 70450, "Marketing Director", 9);
        second_Employee emp5 = new second_Employee(5, "Tom", "Volkov", 35000, "Manager", 4);
        second_Employee emp6 = new second_Employee(6, "Ivan", "Norbit", 52650, "Main Manager", 7);
        second_Employee emp7 = new second_Employee(7, "Sarah", "Scot", 45230, "Communication operator", 6);
        second_Employee emp8 = new second_Employee(8, "Alex", "Magad", 70450, "Marketing Director", 9);
        second_Employee emp9 = new second_Employee(9, "Sarah", "Scotich", 39090, "Communication operator", 6);

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
