package Lecture5DataStructures;

public class PrintElements2dArray {
    public static void main(String[] args) {
        int[][] numbers = {
            {11,22,33},
            {44,55,66},
            {332,566,777},
            {123,311,444}
        };

        for (int i =0; i < numbers.length;i++) {
            for (int j = 0; j<numbers[i].length;j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
