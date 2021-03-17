package HackerEarth;

import java.util.Scanner;

public class BestIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int max = maxVal(arr);
            System.out.println("Max:"+max);
        }
        sc.close();
    }

    static int maxVal(int[] arr){
        int[] sum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum[i] = arr[i];
        }

        for(int i:sum) System.out.print(i+",");

        //finding best index
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sum.length; i++) {
            if(sum[i]>max){
                max = sum[i];
            }
        }
        return max;
    }
}
