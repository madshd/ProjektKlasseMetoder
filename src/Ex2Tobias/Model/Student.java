package Ex2Tobias.Model;

import java.util.Arrays;

public class Student {
    private String name;
    private Boolean active;
    private int grades[];
    private double avg = 0;

    public Student(String name, Boolean active, int[] grades) {
        this.name = name;
        this.active = active;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public Boolean getActive() {
        return active;
    }

    public int[] getGrades() {
        return grades;
    }
    public double getAverage(int[] grades)
    {
        double avg = 0;
        for (int i = 0; i < grades.length ; i++) {
            avg += grades[i];
        }
        avg = (double) avg/grades.length;
        this.avg = avg;
        return (double) avg;
    }
    public double getAverage()
    {
        return avg;
    }
    public int gradeHigh(int[] grades)
    {
        int max = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i]; // Update max to the new maximum value
            }
        } return max;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", active=" + active +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
