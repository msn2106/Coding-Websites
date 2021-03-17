package Codechef;

import java.util.Scanner;

public class CHEFEQZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int[] arr = new int[n];
                for(int i=0;i<n;i++){
                    arr[i] = sc.nextInt();
                }

                int nod = numberofdays(arr,k);
                System.out.println(nod);
            }
        }
        sc.close();
    }

    //helper function
    static int numberofdays(int[] arr, int k){
        int day = 0;
        int pendq = 0;
        for(int i=0;i<arr.length;i++){
            pendq = arr[i]-k;
            if(pendq>=0 && i<arr.length-1)arr[i+1] += pendq;
            else {
                day = i+1;
                break;
            }
        }
        int count = 0;
        if(pendq>0){
            while(pendq>=k){
                count++;
                pendq -=k;
            }
        }

        day = arr.length+count+1;
        return day;
    }
}
/*2
6 5
10 5 5 3 2 1
1 1
100*/