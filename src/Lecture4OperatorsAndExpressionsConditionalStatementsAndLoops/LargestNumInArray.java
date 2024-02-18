package Lecture4OperatorsAndExpressionsConditionalStatementsAndLoops;

public class LargestNumInArray {
    public static void main(String[] args) {
        int numbers[] = {11, 23, 339, 183, 19374};
        int maxNumber = numbers[0];
        for (int i=0; i < numbers.length; i++)
            if (numbers[i]> maxNumber){
            maxNumber = numbers[i];
            }
        System.out.println(maxNumber);
    }

}
