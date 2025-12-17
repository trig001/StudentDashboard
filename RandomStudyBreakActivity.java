import java.util.Scanner;
import java.util.random.*;

public class RandomStudyBreakActivity {

    public static void activity(Scanner scnr) {


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
}
