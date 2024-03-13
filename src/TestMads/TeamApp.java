package TestMads;

import TestMads.Ex2Mads.Student;
import TestMads.Ex2Mads.Team;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



public class TeamApp {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
            int teamCount = 0;
            int studentCount = 0;
            Team[] team = new Team[99];

        for (int i = 0; i < 1;) {
            System.out.println("MENU");
            System.out.println("1: Create a team");
            System.out.println("2: Create a student");
            System.out.println("3: Show one student's info and results");
            System.out.println("4: Show one team's info and results");
            System.out.println("5: Show info and results for all teams");
            System.out.println("6: Exit program");
            int menuChoice = input.nextInt();
/*
            if (menuChoice == 1) {
                team[teamCount] = new Team();
                System.out.println("Input team name ");
                team.setName(input.next());
                System.out.println("Input room name: ");
                team.setRoom(input.next());
                teamCount++;
            }


            if (menuChoice == 2) {
                Student student = new Student();
                System.out.println("Name of students team: ");
                String team = input.next();

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
                studentCount++;
            }

            if (menuChoice == 3) {

            }

 */
        }
    }
}
