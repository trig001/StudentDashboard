import java.util.Scanner;

public class StudentDashboard {

    public static boolean exitMenu = false;
    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);

        System.out.printf("                      +-----------------------+\n" +
                          "                      |                       |\n" +
                          "                      |    Welcome to the     |\n" +
                          "                      |  Student Dashboard    |\n" +
                          "                      |                       |\n" +
                          "                      +-----------------------+\n"
        );

        System.out.println();
        System.out.println("You will be able to access several features that will assist you in completing your studies.");
        System.out.println();

        dashboardMenu();

        System.out.println();
        


        while(!exitMenu) {
            System.out.print("Please Select an option (1-9) or see menu above: ");
            int option = scnr.nextInt();
            
            switch(option) {
                case 1:
                    GpaCalculator.calculator(scnr);
                break;

                case 2:
                    gradeCalculator.calculator(scnr);
                break;

                case 3:
                    studyTimer();
                break;

                case 4:
                    assignmentPriorityChecker();
                break;

                case 5:
                    randomStudyBreakActivity();
                break;

                case 6:
                    coursePasswordGenerator();
                break;

                case 7:
                    tuitionCalculator();
                break;

                case 8:
                    viewStats();
                break;

                case 9:
                    System.out.println("Good luck with your studies! Goodbye!");
                    exitMenu = true;
                break;

                default:
                    System.out.println("Please select a valid option");
            }
        }



        scnr.close();
    }
    

        public static void dashboardMenu() {
            System.out.printf("Menu:\n" +
                              " \n" +
                              "1: GPA Calculator\n" +
                              "2: Grade Calculator\n" +
                              "3: Study Timer\n" +
                              "4: Assignment Priority Checker\n" +
                              "5: Random Study Break Activity\n" +
                              "6: Course Password Generator\n" +
                              "7: Tuition Calculator\n" +
                              "8: View Stats\n" +
                              "9: Exit Menu\n"
            );
        }


        public static void studyTimer() {
            System.out.println("Coming Soon");
        }

        public static void assignmentPriorityChecker() {
            System.out.println("Coming Soon");
        }

        public static void randomStudyBreakActivity() {
            System.out.println("Coming Soon");
        }

        public static void coursePasswordGenerator() {
            System.out.println("Coming Soon");
        }

        public static void tuitionCalculator() {
            System.out.println("Coming Soon");
        }

        public static void viewStats() {
            System.out.println("Coming Soon");
        }

}


