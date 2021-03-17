package Codechef;
/* Template for Codechef */
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */
public class ADADISH
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            //int t = Integer.parseInt(br.readLine());
            if(t >= 1 || t <= 1000){
                while(t-- > 0){
                    while(sc.hasNextInt()){
                        int n = sc.nextInt();
                        //int n = Integer.parseInt(br.readLine());
                        if(n>=1 || n<=4){
                            int[] arr = new int[n];
                            //String[] input = br.readLine().split(" ");
                            for(int i=0;i<n;i++){
                                //arr[i] = Integer.parseInt(input[i]);
                                int temp = sc.nextInt();
                                if(temp>=1 && temp<=5){
                                    arr[i] = temp;
                                }
                                else return;
                            }
                            int minTime = minTime(arr);
                            System.out.println(minTime);
                        }
                        else return;
                    }
                }
            }
            else return;
        }
        sc.close();
        br.close();
    }

    //function to calculate minimum time to prepare the dishes
    public static int minTime(int[] arr){
        int minTime = 0;
        int size = arr.length;
        if(size == 0)return 0;
        if(size == 1)return arr[0];
        if(size == 2)return Math.max(arr[0],arr[1]);
        Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        if(size == 3){
            minTime = arr[2]>(arr[0]+arr[1])?arr[2]:(arr[0]+arr[1]);
        }
        if(size == 4){
            minTime = minTime = arr[3]>(arr[2]+arr[1]+arr[0])?arr[3]:((arr[0]+arr[3])>(arr[1]+arr[2])?(arr[0]+arr[3]):(arr[1]+arr[2]));
        }
        return minTime;
    }
}
/*
Not solved..NZEC
 */
/*
TC 1:
3
3
2 2 2
3
1 2 3
4
2 3 4 5
 */
/*
4
3
7
 */