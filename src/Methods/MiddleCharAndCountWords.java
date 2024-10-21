package Methods;

public class MiddleCharAndCountWords {
    public static void main(String[] args) {

        MiddleCharAndCountWords mid = new MiddleCharAndCountWords();
        System.out.println(mid.countWords("Hello there people"));
    }

    public void middleChars(String text) {
        String middleChar = "";
        int length = text.length();
        int middle = length / 2;
        if (length % 2 == 0) {
            middleChar = text.substring(middle - 1, middle + 1);
        } else {
            middleChar = text.substring(middle, middle + 1);
        }
        System.out.println("The middle of the text \"" + text + "\" is " + middleChar);
    }

    public int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s");
        return words.length;
    }


}
