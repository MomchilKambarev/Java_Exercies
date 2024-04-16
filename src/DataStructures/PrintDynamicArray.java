package DataStructures;

import java.util.Scanner;

public class PrintDynamicArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] usersArray = new int[4][4];
        System.out.println("Enter elements for the 2D array (4x4):");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                usersArray[i][j] = sc.nextInt();
            }
        }
        printArray(usersArray);
    }

    // Method to print the 2D array
    public static void printArray(int[][] array) {
        System.out.println("The 2D array elements are:");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}