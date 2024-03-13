package Ex2Anders;

import java.util.Arrays;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    private char[] svarMC;

    private double avg;

    public Student(String name, boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
        this.svarMC = new char[10];
    }

    public char[] getSvarMC() {
        return this.svarMC;
    }
    public void setSvarMC(char[] svarMC) {
        this.svarMC = svarMC;
    }
    public boolean isActive() {
        return active;
    }

    public int[] getGrades() {
        return grades;
    }

    public String getName() {
        return name;
    }

    public int maxGrade() {
        int max = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= max) {
                max = grades[i];
            }
        }
        return max;
    }

    public double avgGrade() {
        double avg = 0.0;
        for (int i = 0; i < grades.length; i++) {
            avg += grades[i];
        }
        return avg / grades.length;
    }

    @Override
    public String toString() {
        return "[Name: " + name +
                " - " + "Activity: " + active +
                " | Grades: " + Arrays.toString(grades) +
                " - GPA: " + avgGrade() + "]";
    }

    public int correctAnswersCount() {
        int correctAnswersCounter = 0;
        for (int i = 0; i < 10; i++) {
            if (svarMC[i] == MultipleChoiceTest.getKorrekteSvar()[i])
                correctAnswersCounter++;
        }
        return correctAnswersCounter;
    }
}

