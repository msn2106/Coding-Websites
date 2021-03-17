package Codechef;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MEET {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
//        Date sample = new SimpleDateFormat("hh:mm a").parse("12:04 AM");
//        System.out.println(sample);

        int t = sc.nextInt();
        sc.nextLine();
        while(t-- >0){
            String str1 = sc.nextLine();
            System.out.println(str1);
            Date P = new SimpleDateFormat("hh:mm a").parse(str1);
            System.out.println(P);
            int n = sc.nextInt();
            sc.nextLine();
            String[] arr = new String[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLine();
            }
            int pattern = pattern(arr,P);
            System.out.println(pattern);
        }
        sc.close();
    }

    public static int pattern(String[] arr, Date P) throws ParseException {
        Integer pattern = null;
        for(int i=0;i<arr.length;i++){
            String[] date = arr[i].split("AM");
            System.out.println(date[0]+","+date[1]);
            Date d1 = new SimpleDateFormat("hh:mm a").parse(date[0]);
            Date d2 = new SimpleDateFormat("hh:mm a").parse(date[1]);
            if(P.after(d1) && P.before(d2)){
                pattern = pattern*10+1;
            }
            else{
                pattern = pattern*10+0;
            }
        }
        return pattern;
    }
}

/*
2
12:01 AM
4
12:00 AM 11:42 PM
12:01 AM 11:59 AM
12:30 AM 12:00 PM
11:59 AM 11:59 PM
04:12 PM
5
12:00 AM 11:59 PM
01:00 PM 04:12 PM
04:12 PM 04:12 PM
04:12 AM 04:12 AM
12:00 PM 11:59 PM
 */