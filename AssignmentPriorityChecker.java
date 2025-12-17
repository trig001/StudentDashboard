import java.util.Scanner;
public class AssignmentPriorityChecker {
    public static void priorityChecker(Scanner scnr) {


        System.out.printf(" \n" +
                          "+-----------------+\n" +
                          "|                 |\n" +
                          "|   Assignment    |\n" +
                          "|    Priority     |\n" +
                          "|    Checker      |\n" +
                          "|                 |\n" +
                          "+-----------------+\n"
        );
        System.out.println();

        System.out.print("Check what assignments you need to start immediately.\n");
                         
        System.out.println();

        double points = 0;
        double days = 0;
        double difficulty = 0;

        System.out.print("Enter assignment name: ");
        String assignmentName = scnr.nextLine();
        System.out.print("Enter days left: ");
        days = scnr.nextDouble();
        System.out.print("Enter total points: ");
        points = scnr.nextDouble();
        System.out.print("Enter level of difficulty: ");
        difficulty = scnr.nextDouble();

        double priorityScore = ((points / days) + (difficulty * 5));





        System.out.println("____________________________");
        System.out.println();

        System.out.printf("Priority Score: %.0f\n", priorityScore);
        if(priorityScore >= 80) {
            System.out.println("Urgency: High ⚠️");
        } else if(priorityScore <80 && priorityScore >=50) {
            System.out.println("Urgency: Medium");
        } else if(priorityScore < 50) {
            System.out.println("Urgency: Low");
        }
        System.out.println("____________________________");
        System.out.println();

        if(priorityScore >= 80) {
            System.out.println("Recommendation: Start this immediately!!");
            System.out.println("This is a high-priority assignment.");
        } else if(priorityScore <80 && priorityScore >=50) {
            System.out.println("Recommendation: Should be ready to start this if you havent already.");
            System.out.println("This is a medium-priority assignment.");
        } else if(priorityScore < 50) {
            System.out.println("You have time, but don't procrastinate.");
            System.out.println("This is a low-priority assignment.");
        }

        System.out.println();
        
        scnr.nextLine();
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
