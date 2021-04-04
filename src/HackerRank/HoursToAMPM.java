package HackerRank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class HoursToAMPM {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = convertedTime(s);
        System.out.println(result);
    }

    public static String convertedTime(String s) {
        try{
            SimpleDateFormat sf = new SimpleDateFormat("hh:mm:ss aa");
            SimpleDateFormat res = new SimpleDateFormat("HH:mm");
            System.out.println(res.format(sf.parse(s)));
            return s;
        }catch (Exception e){
            e.printStackTrace();
            return s;
        }
    }
}
