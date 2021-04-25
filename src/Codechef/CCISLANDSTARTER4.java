package Codechef;

import java.util.Scanner;

public class CCISLANDSTARTER4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xr = sc.nextInt();
            int yr = sc.nextInt();
            int d = sc.nextInt();

            int mind = Math.min((x/xr),(y/yr));
            if(mind >= d) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
/*
3
4 2 1 1 1
4 2 1 3 1
4 2 4 2 2
 */