package Lecture5DataStructures;
import java.util.Scanner;

public class PrintArrayUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add the rows of the array");
        int rowsNumber = scanner.nextInt();

        System.out.println("Add the columns of the array");
        int columnsNumber = scanner.nextInt();

        int numbers[][] = new int[rowsNumber][columnsNumber];

        for (int row=0; row < rowsNumber;row++) {
            for (int column=0; column < columnsNumber;column++){
            numbers[row][column] = scanner.nextInt();
            }
        }

        for (int row=0; row <rowsNumber;row++){
            for (int column=0;column<columnsNumber;column++)
                System.out.print(numbers[row][column]+ " ");
            }
        System.out.println();



    }
}
