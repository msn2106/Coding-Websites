package GFG;

import java.util.Scanner;

public class SwapNibble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int revN = (n & 0x0F) << 4 | (n & 0xF0) >> 4;
            System.out.println(revN);
        }
        sc.close();
    }
}
