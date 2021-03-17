package Codechef;

import java.util.Scanner;

public class NOTIME3L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        //boolean possible = possible(arr,h,x);
        boolean possible = false;
        for(int i=0;i<arr.length;i++){
            if(x+arr[i]>=h){
                possible = true;
                break;
            }
        }
        if(possible) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }
}
