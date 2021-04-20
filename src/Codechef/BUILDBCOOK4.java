package Codechef;

import java.util.Scanner;

public class BUILDBCOOK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int r = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            //solution
            long val = b[0] , ans = val;
            for (int i = 1; i < n; i++) {
                val -= (long)r * (a[i] - a[i-1]);
                val = Math.max(val , 0);
                val += b[i];
                ans = Math.max(ans,val);
            }

            System.out.println(ans);
        }
        sc.close();
    }
}
//nzec
/*
3
1 2
10
10
2 2
10 11
10 10
3 1
1 2 3
1 2 3
 */
/*
10
18
4
 */