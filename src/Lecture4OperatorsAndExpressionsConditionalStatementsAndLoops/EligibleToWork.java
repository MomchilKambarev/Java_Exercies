package Lecture4OperatorsAndExpressionsConditionalStatementsAndLoops;

import java.util.Scanner;

public class EligibleToWork {
    public static void main(String[] args) {
        Scanner age = new Scanner(System.in);

        if(age.nextInt()>=18){
            System.out.println("The person is eligible to work");
        }
        else {
            System.out.println("The person is not eligible to work");
        }
    }
}
