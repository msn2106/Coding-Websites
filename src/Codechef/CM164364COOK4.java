package Codechef;

import java.util.HashSet;
import java.util.Scanner;

public class CM164364COOK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {
                hs.add(arr[i]);
            }

            int distinct = hs.size();

            int left = n-distinct;
            if(left - x > 0){
                System.out.println(distinct);
            }
            else{
                int temp = left - x;
                distinct = distinct + temp;
                System.out.println(distinct);
            }
        }
        sc.close();
    }
}
