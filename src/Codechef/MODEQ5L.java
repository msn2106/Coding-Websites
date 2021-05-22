package Codechef;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class MODEQ5L
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String[] input = br.readLine().trim().split("\\s+");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            int counter = 0;
            ArrayList<Integer> ar = new ArrayList<>();
            for(int i=0;i<n+1;i++)ar.set(i,1);

            for (int i = 2; i < n; i++) {
                int a = m%i;
                counter += ar.get(a);

                for(int j = a; j <= n; j+=i){
                    int temp = ar.get(j);
                    ar.set(j,++temp);
                }
            }
            System.out.println(counter);
        }
        br.close();
    }
}
//Partially accepted - O(n) approach needed.
/*
3
3 5
3 6
3 10
 */
