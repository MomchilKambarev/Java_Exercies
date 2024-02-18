package Lecture4OperatorsAndExpressionsConditionalStatementsAndLoops;

import java.util.Scanner;

public class CalculateRevenue {

            public static void main(String[] args) {

                System.out.print("Enter unit price: ");
                Scanner scanner = new Scanner(System.in);

                double unitPrice = scanner.nextDouble();

                System.out.print("Enter quantity: ");
                int quantity = scanner.nextInt();
                double discountRate = 0;

                if (quantity >= 100 && quantity <= 120) {
                    discountRate = 0.15;
                } else if (quantity > 120) {
                    discountRate = 0.20;
                }

                double revenue = unitPrice * quantity;
                double discount = revenue * discountRate;
                double totalRevenue;
                totalRevenue = revenue - discount;

                System.out.println("The revenue from sale is: " + totalRevenue);
                System.out.println("Discount: " + discount);
            }
        }
