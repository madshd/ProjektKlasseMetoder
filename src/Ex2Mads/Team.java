package Ex2Mads;

import java.util.ArrayList;

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
    @Override
    public String toString() {
        return "Team " + name +
                " | Room: " + room +
                " | Students: " + students;
    }
}

