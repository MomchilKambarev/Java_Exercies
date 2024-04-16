package AutomationCourseAgain.firstLecutre;

import java.util.Arrays;

public class LeetCode {

    public static void main(String[] args) {

        int[] nums = {3,1,2,10,1};
        int[] newArr = new int[5];

        newArr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            newArr[i] = nums[i] + newArr[i - 1];

        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(newArr[i]);
        }


    }
}