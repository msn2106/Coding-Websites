package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class KAVGMAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int[][] arr = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            long startTime = System.currentTimeMillis();

            int worthy = 0;
            int l = 1;

            int limit = n < m ? n : m;
            long sum = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(arr[i][j] >= k)worthy++;
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println(worthy);
            System.out.println();
            long endTime = System.currentTimeMillis();
            System.out.println("Time taken:"+(endTime-startTime));
        }
        sc.close();
    }

    //function to find average of passed matrix - O(n^2)
    public static long matrixAvg (int[][] arr){
        long avg = 0;
        int length = arr.length;
        int width = arr[0].length;
        int totalElements = length*width;
        long totalSum = 0;
        for(int i=0;i<length;i++){
            for (int j=0;j<width;j++){
                totalSum = totalSum + arr[i][j];
            }
        }
        avg = totalSum/totalElements;
        return avg;
    }
}
/*tc:-
1
3 3 4
2 2 3
3 4 5
4 5 5
 */
/*tc sol:-
7
 */
//Not solved