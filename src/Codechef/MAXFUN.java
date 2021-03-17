package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class MAXFUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int smallest = arr[0];
            int largest = arr[n-1];
            int mid = 0;
            int maxsum = 0;
            if(n%2!=0){
                mid = arr[(n+1)/2];
                maxsum = (largest-smallest)+(mid-smallest)+(largest-mid);
            }
            else{
                int temp1 = arr[n/2];
                int temp2 = arr[(n/2)+1];
                int res1 = (largest-smallest)+(temp1-smallest)+(largest-temp1);
                int res2 = (largest-smallest)+(temp2-smallest)+(largest-temp2);
                maxsum = res1>res2?res1:res2;
            }
            System.out.println(maxsum);
        }
        sc.close();
    }
}
/*
3
3
2 7 5
3
3 3 3
5
2 2 2 2 5
 */