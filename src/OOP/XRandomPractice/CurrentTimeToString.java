package OOP.XRandomPractice;

import java.util.Date;

public class CurrentTimeToString {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        String newDate = date.toString().substring(4,7);
        System.out.println(newDate);

        String EGN = "8711035020";
        String dateOfEGN = EGN.substring(4,6);
        System.out.println(dateOfEGN);
        
//        Date currentDate = new Date();
//        System.out.println(currentDate);
//
//        SimpleDateFormat outputFormat = new SimpleDateFormat("'yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
//        outputFormat.setTimeZone(TimeZone.getTimeZone("Europe/Sofia"));
//
//        String outputDate = outputFormat.format(currentDate);
//
//        System.out.println(outputDate);
    }
}
