package Ex2Tobias.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public char[] activeStudents() {
        int count = 0;
        int j = 0;

        for (Student student : students) {
            if (student.isActive()) {
                count++;
            }
        }
        char[] activeStudents = new char[count];
        for (Student student : students) {
            if (student.isActive()) {
                activeStudents[j] = student.getName().charAt(0); // Convert String to char
                j++;
            }
        }
        return activeStudents;
    }




    public void removeStudent (String name){
        int i = 0;
        while (i < students.size()) {
            if (name.equalsIgnoreCase(String.valueOf(students.get(i).getName()))) {
                students.remove(i);
            }
            i++;
        }
    }

    public double averageGrade() {
        double totalSum = 0;
        int totalGrades = 0;
        for (Student student : students) {
            int[] grades = student.getGrades();
            for (int grade : grades) {
                totalSum += grade;
                totalGrades++;
            }
        }
        System.out.println("Total sum of grades: " + totalSum + " from " + totalGrades + " grades");
        return totalSum / totalGrades;
    }

    public Student[] highScoreStudent(double minAverage) {
        int count = 0;
        for (Student student : students) {
            if (minAverage <= student.avgGrade()) {
                count++;
            }
        }
        Student[] highScore = new Student[count]; // Creating an array of Student objects
        int index = 0;
        for (Student student : students) {
            if (minAverage <= student.avgGrade()) {
                highScore[index] = student;
                index++;
            }
        }

        // Trim the array to remove any unused elements (optional)
        return highScore;
    }
    public int TeamCorrectCount ()
    {
        int teamCount = 0;
        for (Student students : students)
            teamCount += students.CorrectAnswersCount();
      return teamCount;
    }
        public String[] printStudent() {
            String[] arr = new String[students.size()];
            int i = 0;
            for (Student student : students){
                arr[i] = String.format("\n Navn: %s avg grade: %s correct answers: %s",
                        student.getName(), student.avgGrade(), student.CorrectAnswersCount());

                i++;}

            return arr;
        }
    public int[] testResults() {
        int[] arr = new int[10];
        String[] correctAnswers = MultipleChoiceTest.CorrectAnswers(); // Retrieve correct answers

        for (Student student : students) {
            String[] studentChoices = student.getStudentChoices(); // Retrieve student choices
            for (int i = 0; i < 10; i++) {
                if (studentChoices[i].charAt(0) == correctAnswers[i].charAt(0)) // Compare characters correctly
                    arr[i]++;
            }
        }
        return arr;
    }
    @Override
    public String toString() {
        return "Team " + name +
                " | Room: " + room +
                " | Students: " + students;
    }
}

