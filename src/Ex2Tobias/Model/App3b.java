package Ex2Tobias.Test;

import Ex2Tobias.Model.Student;
import Ex2Tobias.Model.Team;

import java.util.Arrays;
import java.util.Scanner;

public class App3b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team[] teams = new Team[10]; // Assuming there can be up to 10 teams
        int teamIndex = 0;

        boolean exit = false;
        while (!exit) {
            System.out.println("MENU");
            System.out.println("1: Create a team");
            System.out.println("2: Create a student");
            System.out.println("3: Show one student's info and results");
            System.out.println("4: Show one team's info and results");
            System.out.println("5: Show info and results for all teams");
            System.out.println("6: Exit program");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Team name and room: ");
                    String teamInput = scanner.nextLine();
                    String[] teamData = teamInput.split(" ");
                    if (teamData.length == 2) {
                        teams[teamIndex] = new Team(teamData[0], teamData[1]);
                        teamIndex++;
                        System.out.println("--> Team created with name and room set to " + teamData[0] + " and " + teamData[1]);
                    } else {
                        System.out.println("Invalid input for team. Please enter name and room separated by space.");
                    }
                    break;
                case 2:
                    System.out.println("Name of student's team: ");
                    String teamName = scanner.nextLine();
                    System.out.println("Student's name and activity status (true/false): ");
                    String studentInput = scanner.nextLine();
                    String[] studentData = studentInput.split(" ");
                    if (studentData.length == 2 || studentData.length == 3) {
                        boolean active = Boolean.parseBoolean(studentData[1]);
                        System.out.println("Student's number of grades: ");
                        int numGrades = scanner.nextInt();
                        int[] grades = new int[numGrades];
                        System.out.println("Student's " + numGrades + " grades: ");
                        for (int i = 0; i < numGrades; i++) {
                            grades[i] = scanner.nextInt();
                        }
                        scanner.nextLine(); // Consume newline
                        Student student = new Student(studentData[0], active, grades);
                        student.calcChoices();
                        for (Team team : teams) {
                            if (team != null && team.getName().equals(teamName)) {
                                team.addStudent(student);
                                System.out.println("--> Student " + student.getName() + "(active: " + active + ") with grades " + Arrays.toString(grades) + " created in team " + teamName);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Invalid input for student. Please enter name, activity status, and grades separated by spaces.");
                    }
                    break;

                case 3:
                    System.out.println("Enter student's name: ");
                    String studentNameInput = scanner.nextLine();
                    System.out.println("Enter student's team: ");
                    String studentTeamInput = scanner.nextLine();
                    boolean found = false;
                    for (Team team : teams) {
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
                    break;

                case 4:
                    System.out.println("Team's name: ");
                    String teamNameInput = scanner.nextLine();
                    for (Team team : teams) {
                        if (team != null && team.getName().equals(teamNameInput)) {
                            System.out.println("--> Team info for team with name " + teamNameInput);
                            System.out.println("Statistics for team: " + teamNameInput);
                            for (Student student : team.getStudents()) {
                                System.out.println("Name: " + student.getName());
                                System.out.println("Average grade: " + student.avgGrade());
                                System.out.println("Correct answers: " + student.CorrectAnswersCount());
                            }
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Information and results for all teams:");
                    for (Team team : teams) {
                        if (team != null) {
                            System.out.println("--> Team info for team with name " + team.getName());
                            System.out.println("Statistics for team: " + team.getName());
                            String[] studentInfo = team.printStudent();
                            for (String info : studentInfo) {
                                System.out.println(info);
                            }
                            System.out.println(); // Add a line break between teams
                        }
                    }
                    break;

                case 6:
                    exit = true;
                    System.out.println("--> Program finished");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        }
        scanner.close();
    }
}
