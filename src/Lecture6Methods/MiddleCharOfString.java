package Lecture6Methods;



public class MiddleCharOfString {
    public static void midCharOfString(String text) {
        String middleChar = "";
        int length = text.length();
        int middle = length / 2;
        if (length % 2 == 0) {
            middleChar = text.substring(middle - 1, middle + 1);
        } else {
            middleChar = text.substring(middle, middle + 1);
        }
        System.out.println("The middle char \"" + text + "\" is " + middleChar);
    }

    public static void main(String[] args) {
        String patron = "ahoyl";
        midCharOfString(patron);
    }
}