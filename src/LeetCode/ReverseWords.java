package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String revword = revword(s);
        System.out.println(revword);
    }

    //function to return reverse word order without useless space.
    public static String revword(String s){
        //s = s.trim();
        s = s.replaceAll("\\s+"," ");
        String[] rev = s.split(" ");
        Collections.reverse(Arrays.asList(rev));
        StringBuilder sb = new StringBuilder();
        for(String str : rev){
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString();
    }
}
