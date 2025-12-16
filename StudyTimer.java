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

        System.out.print("Please enter the time (in minutes) you need to Study: ");
        double timer = scnr.nextDouble();

        

    }
    
}
