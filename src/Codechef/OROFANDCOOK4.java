package Codechef;

import java.util.Scanner;

public class OROFANDCOOK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //finding 1st part - no. of subarray there elements and and subarrays or
            int initialOr = findOr(arr,n);
            System.out.println(initialOr);

//            for (int i = 0; i < q; i++) {
//                int x = sc.nextInt();
//                int v = sc.nextInt();
//            }
        }
        sc.close();
    }

    static int findOr(int[] arr, int n){
        int or = 0;
        int mul = 1;
        for (int i = 0; i < n; i++) {
            boolean count_on = false;
            int l = 0;
            for (int j = 0; j < n; j++) {
                if((arr[j] & (l << i)) > 0){
                    if(count_on)l++;
                    else{
                        count_on = true;
                        l++;
                    }
                }
                else if(count_on){
                    or ^= ((mul * l * (l+1))/2);
                    count_on = false;
                    l = 0;
                }
            }
            if(count_on){
                or ^= (mul * l * (l+1))/2;
                count_on = false;
                l = 0;
            }
            mul *= 2;
        }
        return or;
    }
}
