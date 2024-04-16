package DataStructures;

public class SumOfArray {
    public static void main(String[] args) {
        int[] number = {3, 11, 18, 28, 91, 63, 72};
        int sum = 0;
        for(int i = 0; i<number.length; i++) {
            sum += number[i];
        }
        System.out.println(sum);
    }
}
