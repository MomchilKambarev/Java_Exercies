package SomeExercises;

import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {

        int[][] numbers = new int[4][4];
        numbers = new int[][]{
                {12, 34, 55, 77},
                {123, 56, 123, 66},
                {83, 99, 16, 99},
                {13, 78, 42, 214}};

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}