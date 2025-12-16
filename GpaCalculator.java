import java.util.Scanner;

public class GpaCalculator {

    public static void calculator(Scanner scnr) {

               
        System.out.printf(" \n" +
                          "+----------------+\n" +
                          "|                |\n" +
                          "| GPA Calculator |\n" +
                          "|                |\n" +
                          "+----------------+\n"
        );
        System.out.println();

        int numOfClasses = 0;

        do {
            System.out.print("Please enter how many classes you completed: ");
            numOfClasses = scnr.nextInt();

            if(numOfClasses < 1) {
                System.out.println("Must enter at least 1 class!");
            }
        } while(numOfClasses < 1);

        scnr.nextLine();

        System.out.println();

        
        double grades = 0.0;
        

        for(int i = 1; i <= numOfClasses; i++) {
            System.out.print("Class " + i + " grade (A/B/C/D/F): ");
            String grade = scnr.nextLine().toUpperCase();

            if(grade.equals("A")) {
                grades += 4.0;
            } else if (grade.equals("B")) {
                grades += 3.0;
            } else if (grade.equals("C")) {
                grades += 2.0;
            } else if (grade.equals("D")) {
                grades += 1.0;
            } else if (grade.equals("F")) {
                grades += 0.0;
            } else {
                System.out.println("Please enter a valid letter grade.");
                i--;
                continue;
            }
        }
        System.out.println();
        double gpa = grades / (double)numOfClasses;

        System.out.printf("Your GPA is: %.2f\n", gpa);

        if(gpa >= 3.5) {
            System.out.println("You made the Dean's List 🎉");
        } else {
            System.out.println("Sorry you did not make the Dean's List");
        }

        System.out.println();
        
        String menuAnswer;

        do{ 
            System.out.print("Return to menu? (yes/no) ");
            
            menuAnswer = scnr.nextLine().toLowerCase();;


            if (menuAnswer.equals("yes")) {
                StudentDashboard.dashboardMenu();
            } else if (menuAnswer.equals("no")) {
                System.out.println("Good luck with your studies! Goodbye!");
                StudentDashboard.exitMenu = true;
            }
        } while(!menuAnswer.equals("yes") && !menuAnswer.equals("no"));
    }

    
}
