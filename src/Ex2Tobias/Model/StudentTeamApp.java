package Ex2Tobias.Model;

import java.lang.reflect.Array;
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

        System.out.println(t1.toString());
        System.out.println(Arrays.toString(t1.activeStudents()));

        System.out.println(t2.toString());
        System.out.println(Arrays.toString(t2.activeStudents()));
        System.out.println(s1.maxGrade());
        System.out.println(s7.avgGrade());

        System.out.printf("Team average: %.4f%n", t2.averageGrade());

        //Min avg to pass here: 7 //opg 2.4
        double minAverage = 7;
        System.out.println();
        System.out.println("The Passing Candidates: " + Arrays.toString(t2.highScoreStudent(minAverage)));

        s1.calcChoices();
        s2.calcChoices();
        s3.calcChoices();
        s4.calcChoices();
        s5.calcChoices();
        s6.calcChoices();
        s7.calcChoices();
        s8.calcChoices();
        s9.calcChoices();
        s10.calcChoices();
        s11.calcChoices();

        // Correct for 5-7 students
        System.out.println("Student 7 has: " + s7.CorrectAnswersCount() + " Correct");
        System.out.println("Team1 Overall Correct score: " + t1.TeamCorrectCount());
        System.out.println(Arrays.toString(t1.printStudent()));

        System.out.println("Team Svar fra spørgsmål 1-10 hvor mange de har svaret rigtige: " + Arrays.toString(t1.testResults()));
    }
}
