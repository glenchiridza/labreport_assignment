package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by glenc on Aug 2021
 **/
public class GetCurrentDate {

    public static void main(String[] args) {
        Date currentDate  = new Date();

        SimpleDateFormat format = new SimpleDateFormat("EEE dd/mm/yyyy HH:mm");
        String date = format.format(currentDate);
        System.out.println(date);
    }
}
