package Ex2Tobias.Model;

import java.util.Arrays;
import java.util.Random;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    private double avg;

    public Student(String name, boolean active, int [] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
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
        return avg/grades.length;
    }
    public static void MultipleChoiceTest()
    {
        int[] answers = new int[10];
        int[] list = new int[10];
        String[] choices = {"A", "B", "C", "D"};
        Random random = new Random();
        //Generate Array
        for (int i = 0; i < answers.length ; i++) {
            answers[i] = i;
            list[i] = i;
        }
        for (int i = 0; i < answers.length; i++) {
            // Shuffel Array
            int index = (int)(Math.random() * answers.length);
            int temp = answers[i];
            answers[i] = answers[index];
            answers[index] = temp;
        }
        for (int i = 0; i < 10 ; i++) {
            String choice = choices[answers[i] / 3];
            System.out.println("Choices" + (list[i]+ 1) + ": " + choice);
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + " - " + "Activity: " + active + " | Grades: " + Arrays.toString(grades) + " | AvgGrade: " + avgGrade();
    }
}
