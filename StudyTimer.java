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

        for (int timeLeft = timer; timeLeft > 0; timeLeft --) {

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                System.out.println("Studying Done");
            }
        }

    }
    
}
