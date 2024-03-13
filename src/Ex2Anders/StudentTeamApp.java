package Ex2Anders;

import Ex2Anders.Student;
import Ex2Anders.Team;

import java.util.Arrays;

public class StudentTeamApp {
    public static void main(String[] args) {
        Team t1 = new Team("24V", "1.32");
        Team t2 = new Team("23V", "1.28");
        Student s1 = new Student("Mads", true, new int[]{7,4,10,12});
        Student s2 = new Student("Jon", true, new int[]{7,4});
        Student s3 = new Student("Ans", true, new int[]{4,4,10,10});
        Student s4 = new Student("Tob", true, new int[]{02,4,00});
        Student s5 = new Student("Jens", true, new int[]{7});
        Student s6 = new Student("Lasse", true, new int[]{4,4,4});

        MultipleChoiceTest m1 = new MultipleChoiceTest();
        t1.addStudent(s1);
        t1.addStudent(s2);
        t1.addStudent(s3);
        t1.addStudent(s4);
        t1.addStudent(s5);
        t1.addStudent(s6);

        Student s7 = new Student("Lotte", true, new int[]{7,4,10,12});
        Student s8 = new Student("Jan", true, new int[]{7,4});
        Student s9 = new Student("Ole", true, new int[]{4,4,10,10});
        Student s10 = new Student("Mia Maja", true, new int[]{3,4,6});
        Student s11 = new Student("Lord Bendtner", true, new int[]{7});
        Student s12 = new Student("Messi", true, new int[]{4,4,4});

        t2.addStudent(s7);
        t2.addStudent(s8);
        t2.addStudent(s9);
        t2.addStudent(s10);
        t2.addStudent(s11);
        t2.addStudent(s12);

        // add multiplechoice tests
        m1.MultipleChoiceTest(s2);
        m1.MultipleChoiceTest(s3);
        m1.MultipleChoiceTest(s4);
        m1.MultipleChoiceTest(s5);
        m1.MultipleChoiceTest(s6);
        m1.MultipleChoiceTest(s7);
        m1.MultipleChoiceTest(s8);
        m1.MultipleChoiceTest(s9);
        m1.MultipleChoiceTest(s10);
        m1.MultipleChoiceTest(s11);
        m1.MultipleChoiceTest(s12);

        s2.correctAnswersCount();
        s3.correctAnswersCount();
        s4.correctAnswersCount();
        s5.correctAnswersCount();
        s6.correctAnswersCount();
        s7.correctAnswersCount();
        s8.correctAnswersCount();




        System.out.println(t1.toString());
        System.out.println(Arrays.toString(t1.activeStudents()));

        System.out.println(t2.toString());
        System.out.println(Arrays.toString(t2.activeStudents()));
        System.out.println(s1.maxGrade());
        System.out.println(s7.avgGrade());

        System.out.printf("Team average: %.4f%n", t2.averageGrade());
        System.out.println("High Score: " + Arrays.toString(t2.highScoreStudents(7.0)));

        System.out.printf("Multiple choice test svar:" + Arrays.toString(m1.MultipleChoiceTest(s1)));

        System.out.printf("Multiple choice antal korrekte svar: " + s1.correctAnswersCount());

        System.out.printf(Arrays.toString(s1.getSvarMC()));

        System.out.printf("Korrekte svar for holdet:\n" + Arrays.toString(t1.korrekteSvar()));

        System.out.printf(Arrays.toString(s1.getSvarMC()));
        System.out.printf(Arrays.toString(s2.getSvarMC()));
        System.out.printf(Arrays.toString(s3.getSvarMC()));

        System.out.println("\n\n\n");

        System.out.println(Arrays.toString(t1.print()));
    }
}
