package Lecture2DataTypesVariables;
import java.util.Scanner;


public class AreaTriangleScanner {
    public static void main(String[] args) {
        Scanner base = new Scanner(System.in);
        System.out.println("Give base value");
        int baseValue = Integer.parseInt(base.nextLine());

        Scanner height = new Scanner(System.in);
        System.out.println("Give height value");
        int heightValue = Integer.parseInt(height.nextLine());

        double halfValue = 0.5;
        double triangleArea = heightValue * baseValue * halfValue;

        System.out.println(triangleArea);
    }
}
