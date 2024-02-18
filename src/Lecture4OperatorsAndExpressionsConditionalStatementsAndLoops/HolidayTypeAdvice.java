package Lecture4OperatorsAndExpressionsConditionalStatementsAndLoops;

//Write a program which advices the user where to go to a vacation based on the type of the vacation and the
//budget. There should be two options – Beach, Mountain. If the user put a different value then the program
//should print a message that there is no information about this type of vacation. Budgets are considered per
//day per person. If the budget per day for Beach type vacation is smaller than 50 then the program should
//advise Bulgaria as a destination, otherwise Outside Bulgaria. If the budget per day for Mountain type vacation
//is smaller than 30 then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.


import java.util.Scanner;

public class HolidayTypeAdvice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of vacation would you prefer?");
        String vacationType = scanner.nextLine();

        System.out.println("How many people you are?");
        int people = scanner.nextInt();

        System.out.println("What is your budged per day?");
        double budgetPerDay = scanner.nextDouble();

        double totalBudget = budgetPerDay / people;

        switch (vacationType) {
            case "Beach":
                if (totalBudget < 50) {
                    System.out.println("We advice You to choose Bulgaria");
                } else {
                    System.out.println("We advice You to go outside of Bulgaria");
                }
            case "Mountain":
                if (totalBudget < 30) {
                    System.out.println("We advice You to choose Bulgaria");
                } else {
                    System.out.println("We advice You to go outside of Bulgaria");
                }
                break;
            default:
                System.out.println("No information for the other options available");
        }

    }
}
