package Companies;

import java.util.Scanner;

public class ankita1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int npc = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            int x = (int) Math.round(Math.pow(arr[i], 1.0/3.0));
            if(arr[i] == x*x*x){
                count++;
            }
        }
        System.out.println(count);
    }
}
