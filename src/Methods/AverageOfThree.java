package Methods;

public class AverageOfThree {

    public static void main(String[] args) {
        AverageOfThree avrg = new AverageOfThree();

        System.out.println(avrg.averageOfThree(10,20,30));
        double hi = 0.2;
        System.out.println(hi);
    }

    public int averageOfThree(int num1, int num2, int num3) {
        int sum = (num1 + num2 + num3) / 3;
        return sum;
    }
}
