package DataStructures;

public class BiggestNumOfArray {
    public static void main(String[] args) {
        int[] numbers = {76, 71, 83, 75, 11, 882, 914};

        int biggestNum = numbers[0]; // Initialize with the first element

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > biggestNum) {
                biggestNum = numbers[i];
            }
        }

        System.out.println(biggestNum);
    }
}