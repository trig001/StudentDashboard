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

        double points;
        double days;
        double difficulty;

        System.out.print("Enter assignment name: ");
        String assignmentName = scnr.nextLine();

        do {
            System.out.print("Days until due (1-30): ");
            days = scnr.nextDouble();
            
            if (days < 1 || days > 30) {
                System.out.println("Days must be between 1-30!");
            }
        } while (days < 1 || days > 30);

        do {
            System.out.print("Enter total points (1-500): ");
            points = scnr.nextDouble();
            
            if (points < 1 || points > 500) {
                System.out.println("Points must be between 1-500!");
            }
        } while (points < 1 || points > 500);

        do {
            System.out.print("Enter level of difficulty (1-10): ");
            difficulty = scnr.nextDouble();
            
            if (difficulty < 1 || difficulty > 10) {
                System.out.println("Difficulty must be between 1-10!");
            }
        } while (difficulty < 1 || difficulty > 10);

        double priorityScore = ((points / days) + (difficulty * 5));





        System.out.println("____________________________");
        System.out.println();

        System.out.printf("Priority Score: %.2f\n", priorityScore);
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
            System.out.println("Recommendation: Should be ready to start this if you haven't already.");
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
