package Ex2Tobias.Model;

import java.util.Arrays;
import java.util.Random;

public class MultipleChoiceTest {
    private char[] studentChoices;

    public static char[] MultipleChoiceTest() {
        char[] studentChoices = new char[10];
        String[] choices = {"A", "B", "C", "D"};
        Random random = new Random();

        // Generate Array
        int[] answers = new int[10];
        for (int i = 0; i < answers.length; i++) {
            answers[i] = i;
        }

        // Shuffle Array
        for (int i = 0; i < answers.length; i++) {
            int index = random.nextInt(answers.length);
            int temp = answers[i];
            answers[i] = answers[index];
            answers[index] = temp;
        }

        // Assign choices to studentChoices array
        for (int i = 0; i < 10; i++) {
            char choice = choices[answers[i] / 3].charAt(0);
            studentChoices[i] = choice;
        }

        return studentChoices;
    }

    public static String[] CorrectAnswers()
    {
        String[] correctChoices = {"A", "B", "A", "D", "A", "C", "A", "C", "A", "D"};
        return correctChoices;
    }
}
