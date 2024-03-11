package Ex1;

import java.util.ArrayList;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students ;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(String name) {
        while (students.contains(name)) {
            students.remove(name);
        }
    }

    @Override
    public String toString() {
        return "Team " + name +
                " | Room: " + room +
                " | Students: " + students.toString();
    }
}

