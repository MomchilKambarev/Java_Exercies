package Methods;

public class SmallestNumMethod {

    static int a = 10;
    static int b = 20;
    static int c = 30;

    public static void main(String[] args) {
        System.out.println(smallestNum(a,b,c));
    }

    public static int smallestNum(int a, int b, int c) {
        int smallest = a;
        if (b < smallest) {
            smallest = b;
        } if (c < smallest) {
            smallest = c;
        }
        return smallest;
    }
}
