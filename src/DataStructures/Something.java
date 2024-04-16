package DataStructures;

public class Something {
    public class Test {
        public static int test(int i, int j) {
            if (i == 0) {
                return j;
            } else {
                return test(i - 1, i + j);
            }
        }

        public static void main(String[] args) {
            System.out.println(test(4, 7));
        }
    }

}
