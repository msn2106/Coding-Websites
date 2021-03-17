package Codechef;
import java.util.*;
import java.math.*;
import java.io.*;

public class AttendU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int t = Integer.parseInt(sc.nextLine());
            while(t-- >0){
                int n = Integer.parseInt(sc.nextLine());
                int present = 0;
                String[] b = sc.nextLine().split("");
                //System.out.println(Arrays.toString(b));
                for(int i=0;i<n;i++){
                    int day = Integer.parseInt(b[i]);
                    if(day == 1){
                        present++;
                    }
                }
                System.out.println(present);
                int totalp = (120-n)+present;
                if(totalp >= 90) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}

/*
3
50
00000000000000000000000000000000000000000000000000
50
01010101010101010101010101010101010101010101010101
2
01
 */