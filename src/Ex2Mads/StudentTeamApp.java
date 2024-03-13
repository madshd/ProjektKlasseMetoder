package Ex2Mads;

import Ex2Mads.Student;
import Ex2Mads.Team;
import Ex2Tobias.Model.MultipleChoiceTest;

import java.util.Arrays;

public class StudentTeamApp {
    public static void main(String[] args) {
        Ex2Mads.Team t1 = new Ex2Mads.Team("24V", "1.32");
        Ex2Mads.Team t2 = new Team("23V", "1.28");
        Ex2Mads.Student s1 = new Ex2Mads.Student("Mads", true, new int[]{7,4,10,12});
        Ex2Mads.Student s2 = new Ex2Mads.Student("Jon", true, new int[]{7,4});
        Ex2Mads.Student s3 = new Ex2Mads.Student("Ans", true, new int[]{4,4,10,10});
        Ex2Mads.Student s4 = new Ex2Mads.Student("Tob", true, new int[]{02,4,00});
        Ex2Mads.Student s5 = new Ex2Mads.Student("Jens", true, new int[]{7});
        Ex2Mads.Student s6 = new Ex2Mads.Student("Lasse", true, new int[]{4,4,4});

        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s3);
        t1.addStudent(s4);
        t1.addStudent(s5);
        t1.addStudent(s6);

        Ex2Mads.Student s7 = new Student("Lotte", true, new int[]{7,4,10,12});
        Ex2Mads.Student s8 = new Student("Jan", true, new int[]{7,4});
        Ex2Mads.Student s9 = new Student("Ole", true, new int[]{4,4,10,10});
        Ex2Mads.Student s10 = new Student("Mia Maja", true, new int[]{3,4,6});
        Ex2Mads.Student s11 = new Student("Bendtner", true, new int[]{7});
        Ex2Mads.Student s12 = new Student("Messi", true, new int[]{4,4,4});

        t2.addStudent(s7);
        t2.addStudent(s8);
        t2.addStudent(s9);
        t2.addStudent(s10);
        t2.addStudent(s11);
        t2.addStudent(s12);

        System.out.println(t1.toString());
        System.out.println(Arrays.toString(t1.activeStudents()));

        System.out.println(t2.toString());
        System.out.println(Arrays.toString(t2.activeStudents()));
        System.out.println(s1.maxGrade());
        System.out.println(s7.avgGrade());

        System.out.printf("Team average: %.4f%n", t2.averageGrade());
        System.out.println("High Score: " + Arrays.toString(t2.highScoreStudents(7.0)));

        Ex2Mads.MultipleChoiceTest.MultipleChoiceTest(s7);
        Ex2Mads.MultipleChoiceTest.MultipleChoiceTest(s8);
        Ex2Mads.MultipleChoiceTest.MultipleChoiceTest(s9);
        Ex2Mads.MultipleChoiceTest.MultipleChoiceTest(s10);
        Ex2Mads.MultipleChoiceTest.MultipleChoiceTest(s11);
        Ex2Mads.MultipleChoiceTest.MultipleChoiceTest(s12);
        System.out.println(s7.CorrectAnswersCount());
        System.out.println(s8.CorrectAnswersCount());
        System.out.println(s9.CorrectAnswersCount());
        System.out.println(s10.CorrectAnswersCount());
        System.out.println(s11.CorrectAnswersCount());
        System.out.println(s12.CorrectAnswersCount());


        System.out.println(Arrays.toString(t2.printStudents()));
    }
}
