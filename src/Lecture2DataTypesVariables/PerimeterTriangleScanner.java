package Lecture2DataTypesVariables;

import java.util.Scanner;

class PerimeterTriangleScanner {
    public static void main(String[] args) {
        Scanner sideA = new Scanner(System.in);
        System.out.println("Enter sideA");
        int valueSideA = Integer.parseInt(sideA.nextLine());

        Scanner sideB = new Scanner(System.in);
        System.out.println("Enter sideB");
        int valueSideB = Integer.parseInt(sideA.nextLine());

        Scanner sideC = new Scanner(System.in);
        System.out.println("Enter sideC");
        int valueSideC = Integer.parseInt(sideC.nextLine());

        int totalValue = valueSideA + valueSideB + valueSideC;

        System.out.println(totalValue);
    }
}