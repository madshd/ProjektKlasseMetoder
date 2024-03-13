package Ex2Tobias.Model;

import java.util.Arrays;
import java.util.Random;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;
    private char[] studentChoices; // Corrected to char[]

    private double avg;

    public Student(String name, boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
        this.studentChoices = new char[10]; // Corrected to char[]
    }

    public boolean isActive() {
        return active;
    }

    public String[] getStudentChoices() {
        String[] choices = new String[studentChoices.length];
        for (int i = 0; i < studentChoices.length; i++) {
            choices[i] = String.valueOf(studentChoices[i]);
        }
        return choices;
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
        return avg/grades.length;
    }
    public int CorrectAnswersCount() {
        int count = 0;
        String[] correctChoices = MultipleChoiceTest.CorrectAnswers();
        for (int i = 0; i < 10; i++) {
            if (studentChoices[i] == correctChoices[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }

    public char[] calcChoices() {
        this.studentChoices = MultipleChoiceTest.MultipleChoiceTest();
        return studentChoices;
    }


    @Override
    public String toString() {
        return "Name: " + name + " - " + "Activity: " + active + " | Grades: " + Arrays.toString(grades) + " | AvgGrade: " + avgGrade() + "| Test correct Answers : " + CorrectAnswersCount();
    }
}
