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

    /*
    Udvid klassen Team med en metode, der kan returnere gennemsnittet af alle de karakterer,
    der er givet for de studerende på teamet. (Det forudsættes, at alle teams har mindst én
    studerende.)
     */

//    public double getTeamAverage() {
//        double avg = 0;
//        double totalGrade = 0;
//        int count = 0;
//        for (Student student : students) {
//            if (student.isActive()) {
//                totalGrade += student.avgGrade();
//                count++;
//            }
//        }
//        if (count != 0) {
//            avg = totalGrade / students.size();
//        } else {
//            avg = 0; // Prevent division by zero
//        }
//        return avg;
//    }

    public double averageGrade() {
        double totalSum = 0;
        int totalStudents = students.size();

        for (Student student : students) {
            int[] grades = student.getGrades();
            for (int grade : grades) {
                totalSum += grade;
            }
        }
        System.out.println("Total sum of characters: " + totalSum + " from " + totalStudents + " students.");
        return totalSum / totalStudents;
    }
    @Override
    public String toString() {
        return "Team " + name +
                " | Room: " + room +
                " | Students: " + students.toString();
    }
}

