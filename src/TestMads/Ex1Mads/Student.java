package TestMads.Ex1Mads;

public class Student {
    private String name;
    private boolean active;
    private int[] grades;

    public Student(String name, boolean active, int [] grades) {
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
        return "Name: " + name + " - " + "Activity: " + active + " | " + grades;
    }
}
