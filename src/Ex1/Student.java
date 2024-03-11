package Ex1;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    public Student(String name, boolean active) {
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", active=" + active +
                '}';
    }
}
