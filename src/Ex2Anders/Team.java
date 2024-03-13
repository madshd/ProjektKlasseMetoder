package Ex2Anders;

import Ex2Anders.Student;

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

    public String[] activeStudents() {
        int count = 0;
        for (Student i : students) {
            if (i.isActive() == true) {
                count++;
            }
        }
        String[] aStudents = new String[count];
        count = 0;

        for (Student i : students) {
            if (i.isActive()) {
                aStudents[count] = i.getName();
                count++;
            }
        }
        return aStudents;
    }

    public void removeStudent(String name) {
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

    public int[] korrekteSvar() {
        int i = 0;

        for (Student student : students) {
            i++;
        }

        int[] holdSvar = new int[i];
        i = 0;

        for (Student j : students) {
            holdSvar[i] = j.correctAnswersCount();
            i++;
        }
        return holdSvar;
    }


    /*
    Udvid klassen Team med en metode, der returnerer et array med de aktive studerende, som
    har opnået mindst et gennemsnit givet ved parameteren minAverage.
     */
    public Student[] highScoreStudents(double minAverage) {
        int count = 0;

        // Count the number of high-scoring active students
        for (Student student : students) {
            if (student.isActive() && student.avgGrade() >= minAverage) {
                count++;
            }
        }

        // Create an array to store high-scoring active students
        Student[] highScore = new Student[count];
        int index = 0;

        // Populate the array with high-scoring active students
        for (Student student : students) {
            if (student.isActive() && student.avgGrade() >= minAverage) {
                highScore[index] = student;
                index++;
            }
        }

        return highScore;
    }

    //        for (Student student : students) { // for hver student fra Student klassen, der er i students arrayListen
//            int count = 0;
//            if (student.isActive() == true && student.avgGrade() >= minAverage) {
//
//                count++;
//            }
//            if (student.avgGrade() < minAverage) {
//                count++;
//            }
//        }
//        return highScoreStudents();



    public String[] print() {
        String[] arr = new String[students.size()];
        int i = 0;
        for (Student student : students){
            arr[i] = String.format("Navn: %s avg grade: %s correct answers: %s ",
                    student.getName(), student.avgGrade(), student.correctAnswersCount());

            i++;}

        return arr;
    }
}
