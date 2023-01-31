package comparation;

public class second_Employee implements Comparable<second_Employee> {
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

    public second_Employee(int id, String name, String surname, int salary, String job, int priorityScore) {
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
    @Override
    public int compareTo(second_Employee anotherEmp) {
        int result = ((Integer)(this.priorityScore)).compareTo(anotherEmp.priorityScore);
        if (result == 0){
            result = this.name.compareTo(anotherEmp.name);
            if (result == 0){
                result = this.surname.compareTo(anotherEmp.surname);
            }
        }
        return result;
    }

}
