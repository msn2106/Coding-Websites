package Codechef;

import java.util.*;

public class IMDB3Lunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[][] arr = new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }


            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i][1]>arr[j][1]){
                        int temp = arr[i][1];
                        arr[i][1] = arr[j][1];
                        arr[j][1] = temp;
                        temp = arr[i][0];
                        arr[i][0] = arr[j][0];
                        arr[j][0] = temp;
                    }
                }
            }

            int maxRating = 0;
            for(int i=0;i<n;i++){
                if(arr[i][0]<=x){
                    if(maxRating<arr[i][1]){
                        maxRating = arr[i][1];
                    }
                }
            }

            System.out.println(maxRating);

        }
        sc.close();
    }
}
//TLE O(n) expected - Probable solution using Hashmap
//Answer Correct
/*
3
1 1
1 1
2 2
1 50
2 100
3 2
1 51
3 100
2 50
 */