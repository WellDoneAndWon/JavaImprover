package generics.game;

public class Test {
    public static void main(String[] args) {
        Schollar schollar1 = new Schollar("Ivan",11);
        Schollar schollar2 = new Schollar("Tom",13);

        Student student1 = new Student("John",18);
        Student student2 = new Student("Sarah",19);

        Employee employee1 = new Employee("Simon",33);
        Employee employee2 = new Employee("Lara",31);

        Team<Schollar> schoolarTeam = new Team("LookOutWorld");
        Team<Student> studentTeam = new Team("Smarties");
        Team<Employee> employeeTeam = new Team("Enjoyers");

        schoolarTeam.addNewParticipant(schollar1);
        schoolarTeam.addNewParticipant(schollar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team<Schollar> schoolarTeam2 = new Team("SoBeIt");
        Schollar schollar3 = new Schollar("Cozy",12);
        Schollar schollar4 = new Schollar("Rose",14);
        schoolarTeam2.addNewParticipant(schollar3);
        schoolarTeam2.addNewParticipant(schollar4);
        schoolarTeam.playWith(schoolarTeam2);
    }
}
