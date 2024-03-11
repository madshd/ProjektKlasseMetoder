package Ex2Mads;

import Ex1Mads.Student;
import Ex1Mads.Team;

import java.util.Arrays;

public class StudentTeamApp {
    public static void main(String[] args) {
        Ex1Mads.Team t1 = new Ex1Mads.Team("24V", "1.32");
        Ex1Mads.Team t2 = new Team("23V", "1.28");
        Ex1Mads.Student s1 = new Ex1Mads.Student("Mads", true, new int[]{7,4,10,12});
        Ex1Mads.Student s2 = new Ex1Mads.Student("Jon", true, new int[]{7,4});
        Ex1Mads.Student s3 = new Ex1Mads.Student("Ans", true, new int[]{4,4,10,10});
        Ex1Mads.Student s4 = new Ex1Mads.Student("Tob", true, new int[]{02,4,00});
        Ex1Mads.Student s5 = new Ex1Mads.Student("Jens", true, new int[]{7});
        Ex1Mads.Student s6 = new Ex1Mads.Student("Lasse", true, new int[]{4,4,4});
        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s3);
        t1.addStudent(s4);
        t1.addStudent(s5);
        t1.addStudent(s6);
        Ex1Mads.Student s7 = new Ex1Mads.Student("Lotte", true, new int[]{7,4,10,12});
        Ex1Mads.Student s8 = new Ex1Mads.Student("Jan", true, new int[]{7,4});
        Ex1Mads.Student s9 = new Ex1Mads.Student("Ole", true, new int[]{4,4,10,10});
        Ex1Mads.Student s10 = new Ex1Mads.Student("Mia Maja", true, new int[]{02,4,00});
        Ex1Mads.Student s11 = new Ex1Mads.Student("Lord Bendtner", true, new int[]{7});
        Ex1Mads.Student s12 = new Student("Messi", true, new int[]{4,4,4});
        t2.addStudent(s7);
        t2.addStudent(s8);
        t2.addStudent(s9);
        t2.addStudent(s10);
        t2.addStudent(s11);
        t2.addStudent(s12);
        t2.removeStudent("Mia Maja");

        System.out.println(t1.toString());
        System.out.println(Arrays.toString(t1.activeStudents()));

        System.out.println(t2.toString());
        System.out.println(Arrays.toString(t2.activeStudents()));

    }
}
