package AutomationCourseAgain.firstLecutre;

public class LargestNumInArray {
    public static void main(String[] args) {

        int[] numbers = {11, 55, 66, 88 , 100, 260, 1, 1000};
        int largestNum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNum) {
                largestNum = numbers[i];
            }
        }
        System.out.println(largestNum);
    }
}
