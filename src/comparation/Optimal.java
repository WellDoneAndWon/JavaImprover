package comparation;

import java.util.Comparator;

public class Optimal {
    public class Employee {
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

        public Employee(int id, String name, String surname, int salary, String job, int priorityScore) {
            this.id = id;
            this.name = name;
            this.surname = surname;
            this.salary = salary;
            this.job = job;
            this.priorityScore = priorityScore;
        }



/*    @Override
    public int compareTo(second_Employee anotherEmp) {
        // Classic method
        if (this.priorityScore == anotherEmp.priorityScore){
            return 0;
        }
        else if (this.priorityScore < anotherEmp.priorityScore) {
            return -1;
        }
        else {
            return 1;
        }
    }*/

/*    @Override
    public int compareTo(second_Employee anotherEmp) {
        // Simple method
        return this.priorityScore - anotherEmp.priorityScore;
    }*/

        /*    @Override
            public int compareTo(second_Employee anotherEmp) {
                // Original method. Using Comparable in Integer, String
                return this.name.compareTo(anotherEmp.name);
            }*/
        public static class IdComparator implements Comparator<comparation.ThirdEmployee> {

            @Override
            public int compare(comparation.ThirdEmployee emp1, comparation.ThirdEmployee emp2) {
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
        public static class NameComparator implements Comparator<comparation.ThirdEmployee> {

            @Override
            public int compare(comparation.ThirdEmployee emp1, comparation.ThirdEmployee emp2) {
                return emp1.name.compareTo(emp2.name);
            }
        }

        public static class SalaryComparator implements Comparator<comparation.ThirdEmployee> {

            @Override
            public int compare(comparation.ThirdEmployee emp1, comparation.ThirdEmployee emp2) {
                return emp1.priorityScore - emp2.priorityScore;
            }
        }
    }

}
