package AutomationCourseAgain.firstLecutre;

public class DivisibleBy5 {
    public static void main(String[] args) {

        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int i = 0; i < list.length; i++) {
            if (list[i] % 5 == 0) {
                if (list[i] > 150)
                    break;
                System.out.println(list[i]);
            }
        }
    }
}
