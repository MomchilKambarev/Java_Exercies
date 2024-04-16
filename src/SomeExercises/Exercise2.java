package SomeExercises;

public class Exercise2 {
    public static void main(String[] args) {
        String[][] wordData = {{"study", "consider", "examine", "learn"}, {"ponder", "read", "think", "cogitate"}};

        int characterCount = 0;
        for (String[] word : wordData) {
            for (String c : word) {
                characterCount += c.length();
            }
        }
//        System.out.println(characterCount);
        int i = 0; int j = 0;
        while (i < wordData.length) {
            j = 0;
            while (j < wordData[i].length) {
                System.out.println(wordData[i][j] + ": [" + i + "]" + "[" + j + "]");
                j++;
            }
            i++;
        }


    }

}