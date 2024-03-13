package Ex2Mads;

import java.lang.reflect.Array;
import java.util.ArrayList;
import Ex2Mads.Student;
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

    public String[] activeStudents () {
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

public int teamScore() {
    int totalSum = 0;
    for (Student student : students) {
        totalSum += student.CorrectAnswersCount();
    }
    return totalSum;
}


    @Override
    public String toString() {
        return "Team " + name +
                " | Room: " + room +
                " | Students: " + students;
    }

    public String[] teamPrint() {
        // Create an array to store high-scoring active students
        String[] print = new String[students.size()];
        int i = 0;
        for (Student student : students) {
            String studentPrint = name + " | NAME | GPA | CA | " +
                    student.getName() + " - " +
                    student.avgGrade() + " - " +
                    student.CorrectAnswersCount() + "\n";
            print[i++] = studentPrint; // Tilføj den aktuelle studerendes information til print arrayet
        }
        return print;
    }
}

