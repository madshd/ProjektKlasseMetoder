package TestMads;

import TestMads.Ex2.Student;
import TestMads.Ex2.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class TeamApp {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Team> teamArrayList = new ArrayList<>(); // ArrayList to store teams

    public static void main(String[] args) {
        for (int i = 0; i < 1;) {
            int teamCount = 0;
            int studentCount = 0;
            System.out.println("MENU");
            System.out.println("1: Create a team");
            System.out.println("2: Create a student");
            System.out.println("3: Show one student's info and results");
            System.out.println("4: Show one team's info and results");
            System.out.println("5: Show info and results for all teams");
            System.out.println("6: Exit program");
            int menuChoice = input.nextInt();

            if (menuChoice == 1) {
                Team team = new Team();
                System.out.println("Input team name ");
                team.setName(input.next());
                System.out.println("Input room name: ");
                team.setRoom(input.next());
                teamArrayList.add(team); // Add the created team to the ArrayList
                teamCount++;
            }
            if (menuChoice == 2) {
                System.out.println("Name of students team: ");
                String teamName = input.next();

                // Find the team with the matching name
                Team selectedTeam = null;
                for (Team team : teamArrayList) {
                    if (team.getName().equals(teamName)) {
                        selectedTeam = team;
                        break;
                    }
                }

                if (selectedTeam != null) {
                    System.out.println("Input student name: ");
                    String name = input.next();

                    System.out.println("Is student active: ");
                    boolean active = input.nextBoolean();

                    System.out.println("Number of grades: ");
                    int gradesCount = input.nextInt();
                    int[] grades = new int[gradesCount];

                    System.out.println("Student grades: ");
                    for (int j = 0; j < grades.length; j++) {
                        grades[j] = input.nextInt();
                    }

                    // Create a new student and add it to the appropriate team
                    Student student = new Student(name, active, grades);
                    selectedTeam.addStudent(student);

                    studentCount++;
                } else {
                    System.out.println("No team found with the name: " + teamName);
                }
            }

            if (menuChoice == 3) {
                System.out.println("Enter student's name: ");
                String studentNameInput = input.nextLine();
                System.out.println("Enter student's team: ");
                String studentTeamInput = input.nextLine();
                boolean found = false;
                for (Team team : teamArrayList) {
                    if (team != null && team.getName().equals(studentTeamInput)) {
                        for (Student student : team.getStudents()) {
                            if (student.getName().equals(studentNameInput)) {
                                System.out.println("--> Student info for " + studentNameInput);
                                System.out.println("Name: " + student.getName());
                                System.out.println("Average grade: " + student.avgGrade());
                                System.out.println("Correct answers: " + student.CorrectAnswersCount());
                                found = true;
                                break;
                            }
                        }
                        if (found) {
                            break;
                        }
                    }
                }
                if (!found) {
                    System.out.println("Student not found.");
                }
            }
        }
    }
}
