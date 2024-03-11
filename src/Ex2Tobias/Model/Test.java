package Ex2Tobias.Model;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Team hold1 = new Team("Hold1", "A24");
        Team hold2 = new Team("Hold2", "V24");

        Student student1 = new Student("Bobby", true, new int[]{3,3,12,6});
        Student student2 = new Student("Jens", true, new int[]{4, 10, 10, 12});
        Student student3 = new Student("Peter", true, new int[]{2});
        Student student4 = new Student("Søren", false, new int[]{4});
        Student student5 = new Student("Harald", false, new int[]{2});
        Student student6 = new Student("Mosses", true, new int[]{1});

        hold1.addStudent(student1);
        hold1.addStudent(student2);
        hold1.addStudent(student3);
        hold2.addStudent(student4);
        hold2.addStudent(student5);
        hold2.addStudent(student6);
        System.out.println(hold1.toString());
        System.out.println(hold2.toString());

        hold1.removeStudent("jens");
        System.out.println(hold1.toString());
        System.out.println(Arrays.toString(hold1.activeStudents()));
        System.out.println(Arrays.toString(hold2.activeStudents()));

        System.out.println(student1.gradeHigh(student1.getGrades()));
        System.out.println(student1.getAverage(student1.getGrades()));

        //Get Team Avg
        hold1.getTeamAvarage(hold1);
        System.out.println(hold1.getTeamAvarage(hold1));

    }
}
