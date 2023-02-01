package comparation;

import javax.swing.border.EmptyBorder;
import java.util.Comparator;

public class ThirdEmployee {
    public int id;
    public String name;
    public String surname;
    public int salary;
    public String job;

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

    public int priorityScore;

    public ThirdEmployee(int id, String name, String surname, int salary, String job, int priorityScore) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.job = job;
        this.priorityScore = priorityScore;
    }

    public static class IdComparator implements Comparator<ThirdEmployee> {

        @Override
        public int compare(ThirdEmployee emp1, ThirdEmployee emp2) {
            if (emp1.id == emp2.id){
                return 0;
            }
            else if (emp1.id < emp2.id) {
                return -1;
            }
            else {
                return 1;
            }
        }
    }
    public static class NameComparator implements Comparator<ThirdEmployee> {

        @Override
        public int compare(ThirdEmployee emp1, ThirdEmployee emp2) {
            return emp1.name.compareTo(emp2.name);
        }
    }

    public static class SalaryComparator implements Comparator<ThirdEmployee> {

        @Override
        public int compare(ThirdEmployee emp1, ThirdEmployee emp2) {
            return emp1.salary - emp2.salary;
        }
    }
}

