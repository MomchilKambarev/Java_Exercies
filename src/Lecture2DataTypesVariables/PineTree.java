package Lecture2DataTypesVariables;

public class PineTree {
    public static void main(String[] args) {

        //set height
        int height = 7;

        for (int i = 1; i <= height; i++) {

            //prints spaces
            for (int space = 1; space <= height - i; space++) {
                System.out.print(" ");
            }

            //print stars
            for (int stars = 1; stars <= i * 2 - 1; stars++) {
                System.out.print("*");
            }

            //prints new line
            System.out.println();
        }
    }

}
