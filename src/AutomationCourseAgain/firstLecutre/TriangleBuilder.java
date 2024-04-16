package AutomationCourseAgain.firstLecutre;

import java.util.Scanner;

public class TriangleBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter angle A");
        double angleA = scanner.nextDouble();

        System.out.println("Enter angle B");
        double angleB = scanner.nextDouble();

        System.out.println("Enter angle C");
        double angleC = scanner.nextDouble();

        double anglesSum = angleA + angleB + angleC;

        //Checks if the triangle can be build
        if (angleA > 0 && angleB > 0 && angleC > 0 && anglesSum == 180) {
            System.out.println("Such triangle exists");

            //Check if the triangle is acute / right / obtuse
            if (angleA > 90 || angleB > 90 || angleC > 90) {
                System.out.println("The triangle is obtuse");
            } else if (angleA == 90 || angleB == 90 || angleC == 90) {
                System.out.println("Triangle is right-angled");
            } else {
                System.out.println("The triangle is acute");
            }
            //Check if the triangle is equilateral / isosceles / multifaceted
            if (angleA == angleB && angleB == angleC) {
                System.out.println("The triangle is equilateral");
                } else if (angleA == angleB || angleB == angleC || angleA == angleC) {
                    System.out.println("The triangle is isosceles");
                } else {
                    System.out.println("The triangle is multifaceted");
                }

        } else {
            System.out.println("Triangle can't be build");
        }
    }
}