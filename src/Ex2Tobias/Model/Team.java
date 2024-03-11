package Ex2Tobias.Model;

import java.util.ArrayList;

public class Team {
    private String name;
    private String room;
    private ArrayList<Student> students;
    private double teamAvg = 0;

    public Team(String name, String room) {
        this.name = name;
        this.room = room;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student)
    {
        if (student.getActive())
        {
                students.add(student);

        }

    }
    public String[] activeStudents()
    {
        int count = 0;
        int j = 0;

        for (Student i : students)
        {
            if (i.getActive())
            {
                count++;
            }
        }
        String activeStudents[] = new String[count];
        for (Student i : students)
        {
            if (i.getActive())
            {
                activeStudents[j] = i.getName();
                j++;
            }
        }


        return activeStudents;
    }
    public double getTeamAverage() {
        double totalGrade = 0;
        int count = 0;
        for (Student student : students) {
            if (student.getActive()) {
                totalGrade += student.getAverage();
                count++;
            }
        }
        if (count != 0) {
            this.teamAvg = totalGrade / students.size();
        } else {
            this.teamAvg = 0; // Prevent division by zero
        }
        return this.teamAvg;
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

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", room='" + room + '\'' +
                ", grades=" + students +
                '}';
    }
}

