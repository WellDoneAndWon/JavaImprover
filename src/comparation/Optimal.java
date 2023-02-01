package comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

    public class Optimal {
        public static void main(String[] args) {
            List<Employee> listEmployees = new ArrayList<>();
            Employee emp1 = new Employee(1, "Tom", "Verkov", 32500, "Manager", 4);
            Employee emp2 = new Employee(2, "Ivan", "Ivanov", 55250, "Main Manager", 7);
            Employee emp3 = new Employee(3, "Sarah", "Bora", 40000, "Communication operator", 6);
            Employee emp4 = new Employee(4, "Alex", "Samver", 70450, "Marketing Director", 9);
            Employee emp5 = new Employee(5, "Tom", "Volkov", 35000, "Manager", 4);
            Employee emp6 = new Employee(6, "Ivan", "Norbit", 52650, "Main Manager", 7);
            Employee emp7 = new Employee(7, "Sarah", "Scot", 45230, "Communication operator", 6);
            Employee emp8 = new Employee(8, "Alex", "Magad", 70450, "Marketing Director", 9);
            Employee emp9 = new Employee(9, "Sarah", "Scotich", 39090, "Communication operator", 6);

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
//            Collections.sort(listEmployees); //Если хотим по ID
            Collections.sort(listEmployees, new NameComparator());
            System.out.println("Sorted Employees:" + listEmployees);
        }
    }

    class Employee implements Comparable<Employee> {
        public int id;
        public String name;
        public String surname;
        public int salary;
        public String job;
        public int priorityScore;


        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", salary=" + salary +
                    ", job='" + job + '\'' +
                    ", priorityScore=" + priorityScore +
                    '}';
        }

        public Employee(int id, String name, String surname, int salary, String job, int priorityScore) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
            this.job = job;
            this.priorityScore = priorityScore;
        }

        @Override
         public int compareTo(Employee anotherEmp) {
            if (this.priorityScore == anotherEmp.priorityScore){
                return 0;
            }
            else if (this.priorityScore < anotherEmp.priorityScore) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }
    class NameComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.name.compareTo(emp2.name);
        }
    }

    class SalaryComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee emp1, Employee emp2) {
            return emp1.salary - emp2.salary;
        }
    }

