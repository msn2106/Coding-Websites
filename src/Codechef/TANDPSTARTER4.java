package Codechef;

import java.util.Scanner;

public class TANDPSTARTER4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            int thief = n - x + m - y;
            int min = n-a < m-b ? n-a : m-b;
            int police = n - a + m - b - min;
            if(thief <= police) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}
