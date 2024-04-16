package AutomationCourseAgain.firstLecutre;

import java.util.Scanner;

public class CalculateRevenue {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double quantity = scanner.nextDouble();

        double unitPrice = 25;

        double revenueFromSale;
        double totalSum;
        double discount;

        double discountPercent = 0;
        if (quantity < 99) {
            discountPercent = 0;
        } else if (quantity > 99 && quantity < 119) {
            discountPercent = 0.85;
        } else if (quantity > 120) {
            discountPercent = 0.8;
        } else {
            System.out.println("Invalid input");
        }
        totalSum = unitPrice * quantity;
        revenueFromSale = (unitPrice * quantity) * discountPercent;
        discount = totalSum - revenueFromSale;

        System.out.println(totalSum);
        System.out.println(revenueFromSale);
        System.out.println(discount);
    }

}
