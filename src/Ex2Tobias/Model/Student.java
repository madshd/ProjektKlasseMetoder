package Ex2Tobias.Model;

import java.util.Arrays;
import java.util.Random;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;
    private String[] studentChoices;

    private double avg;

    public Student(String name, boolean active, int [] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
        this.studentChoices = new String[10];
    }

    public boolean isActive() {
        return active;
    }

    public String[] getStudentChoices() {
        return studentChoices;
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
    public int CorrectAnswersCount()
    {
        int count = 0;
        for (int i = 0; i < 10 ; i++) {
            String[] correctChoices = MultipleChoiceTest.CorrectAnswers();
            if (studentChoices[i] == correctChoices[i])
            {
                count++;
            }
            
        } return count;
        
    }
    public String[] CalcChoices() {
        for (int i = 0; i < 10; i++) {
            int[] answers = new int[10];
            String[] studentChoices = new String[10];
            String[] choices = {"A", "B", "C", "D"};
            Random random = new Random();
            //Generate Array
            for (i = 0; i < answers.length; i++) {
                answers[i] = i;
            }
            for (i = 0; i < answers.length; i++) {
                // Shuffel Array
                int index = (int) (Math.random() * answers.length);
                int temp = answers[i];
                answers[i] = answers[index];
                answers[index] = temp;
            }
            for (i = 0; i < 10; i++) {
                String choice = choices[answers[i] / 3];
//            System.out.println("Choices: " + (i+ 1) + ": " + choice);
                this.studentChoices[i] = choice;

            }
        } return this.studentChoices;
    }

    @Override
    public String toString() {
        return "Name: " + name + " - " + "Activity: " + active + " | Grades: " + Arrays.toString(grades) + " | AvgGrade: " + avgGrade() + "| Test correct Answers : " + CorrectAnswersCount();
    }
}
