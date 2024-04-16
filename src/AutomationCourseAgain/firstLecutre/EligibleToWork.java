package AutomationCourseAgain.firstLecutre;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age here:");
        int userAge = scanner.nextInt();

        if (userAge <16) {
            System.out.println("User is not allowed to work yet!");
        } else if (userAge > 16 && userAge < 64) {
            System.out.println("User can work :)");
        } else {
            System.out.println("User too old to work");
        }
    }
}
