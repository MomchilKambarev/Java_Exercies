package Lecture5DataStructures;

public class FindBiggestElementArray {
    public static void main(String[] args) {

        int masiv[] = {11, 22, 33, 44, 55, 66, 77};

        int sum = masiv[0];
        for (int i=0; i<masiv.length;i++){
            if (sum < masiv[i]) {
                sum = masiv[i];
            }
        }
        System.out.println(sum);
    }
}
