package ConstructorsAndExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadsTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, num2;
        try {
            System.out.println("Provide first num");
            num = scanner.nextInt();
            System.out.println("Provide second num");
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.printStackTrace();
            throw new RuntimeException("Please provide a valid whole number");
        }
        System.out.println(readsAndDivide(num, num2));
    }

    public static double readsAndDivide(double x, double y) {
        if (x == 0 || y == 0) {
            throw new ArithmeticException("Can't devide by zero");
        }
        return x / y;
    }
}

