package Lecture4OperatorsAndExpressionsConditionalStatementsAndLoops;

public class SixTaskArrayNumberDivisible5 {
    public static void main(String[] args) {

        int numbers[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 0; i < numbers.length; i++) {
            int displayNumbers = numbers[i];
            if (displayNumbers <= 150) {
                if (displayNumbers % 5 == 0)
                    System.out.println(displayNumbers);
            }
        }

    }
}
