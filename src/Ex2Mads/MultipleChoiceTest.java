package Ex2Mads;

import Ex2Mads.Student;

import java.util.Arrays;
import java.util.Random;

public class MultipleChoiceTest {
    private String[] studentChoices;
    public static void MultipleChoiceTest(Student student)
    {
        int[] answers = new int[10];
        String[] studentChoices = new String[10];
        String[] choices = {"A", "B", "C", "D"};
        Random random = new Random();
        student.CalcChoices();
        System.out.println("studentChoices: " + Arrays.toString(student.CalcChoices()));
    }
    public static String[] CorrectAnswers()
    {
        String[] correctChoices = {"A", "B", "A", "D", "A", "C", "A", "C", "A", "D"};
        return correctChoices;
    }
}


//studentChoices[i] = choice;
