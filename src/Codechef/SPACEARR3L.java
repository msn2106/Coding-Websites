package Codechef;

import java.util.Arrays;
import java.util.Scanner;

public class SPACEARR3L {
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
            int count = 0,lastc = 0;
            for(int i=0;i<n;i++){
                if((i+1)>=arr[i]){
                    count += (i+1)-arr[i];
                    lastc = i;
                }
                else break;
            }
            System.out.println(count);
            if(lastc<n-1 || count %2==0){
                System.out.println("Second");
            }
            else System.out.println("First");
        }
        sc.close();
    }
}
/*
4
4
1 2 3 3
4
1 1 3 3
5
1 2 2 1 5
3
2 2 3
 */
/*
Solved after the time - Used video as help
 */