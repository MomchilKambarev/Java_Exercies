package DataStructures;

public class Print2DArray {
    public static void main(String[] args) {
        int[][] numbers = {
                {33, 81, 33},
                {77, 66, 55},
                {123,333,555}
        };
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[0].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
