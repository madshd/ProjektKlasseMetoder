package Ex1;

import java.util.ArrayList;

public class StudentTeamApp {
    public static void main(String[] args) {
        Team t1 = new Team("24V", "1.32");
        Student s1 = new Student("Mads", true);
        Student s2 = new Student("Jon", true);
        Student s3 = new Student("Ans", true);
        Student s4 = new Student("Tob", true);
        Student s5 = new Student("Jens", true);
        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s3);
        t1.addStudent(s4);
        t1.addStudent(s5);
        System.out.println(t1.toString());

        t1.removeStudent("Jon");

    }
}
