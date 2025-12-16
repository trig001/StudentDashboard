import java.util.Scanner;

public class GradeCalculator {

    public static void calculator(Scanner scnr) {

        System.out.printf(" \n" +
                          "+----------------+\n" +
                          "|                |\n" +
                          "|     Grade      |\n" +
                          "|   Calculator   |\n" +
                          "|                |\n" +
                          "+----------------+\n"
        );
        System.out.println();
        System.out.println("Welcome to the grade calculator. We will \n" +
                           "calculate the score you need on your final \n" +
                           "to accomplish your desired grade for the course."
        );
        System.out.println();

        double currentGrade;
        double desiredGrade;
        double weightOfFinalExam;

        do {
            System.out.print("Please enter your current grade percentage: ");
            currentGrade = scnr.nextDouble();

            if (currentGrade < 0 || currentGrade > 100) {
                System.out.println("Grade must be between 0 - 100.");
            }
        } while (currentGrade < 0 || currentGrade > 100);

        do {
            System.out.print("Please enter your desired grade percentage: ");
            desiredGrade = scnr.nextDouble();

            if (desiredGrade < 0 || desiredGrade > 100) {
            System.out.println("Grade must be between 0 - 100.");
            }

        } while (desiredGrade < 0 || desiredGrade > 100);

        do {
            System.out.print("Please enter the weight of the final exam in percentage: ");
            weightOfFinalExam = scnr.nextDouble();

            if (weightOfFinalExam < 0 || weightOfFinalExam > 100) {
            System.out.println("Grade must be between 0 - 100.");
            }
            
        } while(weightOfFinalExam < 0 || weightOfFinalExam > 100);

        scnr.nextLine();
        System.out.println();

        double neededScore = ((desiredGrade - currentGrade * ((100 - weightOfFinalExam) / 100)) / weightOfFinalExam * 100);

        System.out.printf("Current: %.2f%%\n", currentGrade);
        System.out.printf("Desired: %.2f%%\n", desiredGrade);
        System.out.printf("Exam weight: %.2f%%\n", weightOfFinalExam);
        System.out.println();
        System.out.printf("You need to score %.2f%% on the final exam.\n", neededScore);
        System.out.println();

        if(neededScore > 100.00) {
            System.out.println("Sorry but you cannot achieve your desired score. 😢");
        } else if(neededScore < 0) {
            System.out.println("You have already achieved it, congratulations! 🎊");
        } else if(neededScore > 0 && neededScore < 90) {
            System.out.println("It's going to be difficult but with intense studying you can do it!");
        } else {
            System.out.println("You are almost there, keep up what you have been doing and you should be able to achieve your desired score!");
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
