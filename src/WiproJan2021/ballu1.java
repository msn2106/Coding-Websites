package WiproJan2021;

import java.util.Scanner;

public class ballu1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        char[] ch = s.toCharArray();
        int count = 0;
        for(char c:ch){
            if(Character.isDigit(c)){
                count++;
            }
        }
        System.out.println(count);
    }
}
