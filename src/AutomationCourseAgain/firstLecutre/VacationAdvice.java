package AutomationCourseAgain.firstLecutre;

import java.util.Scanner;

public class VacationAdvice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfVacation = scanner.nextLine();
        int budget = scanner.nextInt();

        if (typeOfVacation.equalsIgnoreCase("Beach")) {
            System.out.println("Sea vacation is chosen, please proceed to enter the budget");
            if (budget < 50) {
                System.out.println("You should pick Bulgaria as an option");
            } else {
                System.out.println("You can choose Outside of Bulgaria with that budget");
            }
        }

        if (typeOfVacation.equalsIgnoreCase("Mountain")) {
            System.out.println("Mountain vacation is chosen, please proceed to enter the budget");
            if (budget < 30) {
                System.out.println("You should pick Bulgaria mountain as an option");
            } else {
                System.out.println("You can choose something outside of Bulgaria - Alps etc");
            }
        }
    }
}
