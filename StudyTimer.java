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

            if(timer < 1 || timer > 120) {
                System.out.println("Please enter time between 1-120 minutes.");
            }
        } while (timer < 1 || timer >120);

        double quarter = timer / .25;
        int checkpoint = (int) Math.round(timer - quarter);
        int remainingPercent = 100;

        for (int timeLeft = timer; timeLeft > 0; timeLeft --) {

            if (quarter > 0 && timeLeft == checkpoint) {
                remainingPercent -= 25;
                System.out.println(remainingPercent + "% remaining");
                checkpoint -= quarter;
            }

            if (timeLeft == (timer / 2)) {
                System.out.println("You have been studing hard, maybe its time for a break?");
            }

            System.out.printf("You have %d minutes left.\n", timeLeft);

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Studying Done");
            }
        }

    }
    
}
