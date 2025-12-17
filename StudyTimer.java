import java.util.Scanner;
public class StudyTimer {
    public static void timer(Scanner scnr) {

        System.out.printf(" \n" +
                          "+-----------------+\n" +
                          "|                 |\n" +
                          "|   Study Timer   |\n" +
                          "|                 |\n" +
                          "+-----------------+\n"
        );
        System.out.println();

        System.out.print("Welcome to your trust study timer. Just set the time\n" +
                         "you want to study and the alarm will let you know\n" +
                         "when you are done.\n");
                         
        System.out.println();

        int timer;
        do {
            System.out.print("Please enter the time (in minutes) you need to Study: ");
            timer = scnr.nextInt();
            scnr.nextLine();

            if(timer < 1 || timer > 120) {
                System.out.println("Please enter time between 1-120 minutes.");
            }
        } while (timer < 1 || timer >120);

        for (int timeLeft = timer; timeLeft > 0; timeLeft --) {

            if (timeLeft == Math.round(timer * .75)) {
                System.out.println("75% time remaining, maybe it's time to take a break.");
            } else if(timeLeft == Math.round(timer * .5)) {
                System.out.println("50% of your study time is remaining, should we take another break?");
            } else if(timeLeft == Math.round(timer * .25)) {
                System.out.println("25% time remaining, it's ok to take one last break before reaching the end!");
            }

            System.out.printf("You have %d minutes left.\n", timeLeft);

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Studying Done");
            } 
        }
        System.out.println();
        System.out.printf("Session completed you studied for %d minutes\n", timer);
        System.out.println("Great Work");

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
