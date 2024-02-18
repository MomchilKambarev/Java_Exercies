package Lecture6Methods;

public class SmallestNumber {
    public static void main(String[] args) {
        int a = 12;
        int b = 13;
        int c = 14;
        System.out.println(smallestNumber(a,b,c));
    }

    public static int smallestNumber(int num1, int num2, int num3){
        int smallest = num1;
        if(num2 < num1){
            smallest=num2;
        }
        if (num3 < smallest){
            num3 = smallest;
        }
        return smallest;
    }
}
