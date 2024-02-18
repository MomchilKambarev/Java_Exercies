package Lecture6Methods;

public class AverageOfNumbers {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 13;
        int num3 = 14;
        System.out.println(computeAverage(num1,num2,num3));
    }

    public static int computeAverage(int a, int b, int c){
        int averageNum = (a + b + c) / 3;
        return averageNum;
    }
}
