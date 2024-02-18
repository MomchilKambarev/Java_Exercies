package Lecture5DataStructures;

public class SumOfArray {
    public static void main(String[] args) {
        int number[] = {11,35,82,391,283};
        int sum = 0;
        for (int i=0; i<=number.length-1;i++){
            int sum2 = number[i];
            sum+=sum2;
        }
        System.out.println(sum);
    }
}
