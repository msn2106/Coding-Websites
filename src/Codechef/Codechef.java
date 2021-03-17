/* package codechef; // don't place package name! */
package JulyLongChallenge;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] pip = new int[n];
		    for(int i=0;i<n;i++){
		        pip[i] = sc.nextInt();
		    }
		    
		    //finding the number of moves of each player for capturing
		    int[] res = new int[n];
		    for(int i=0;i<n;i++){
		        if(k % pip[i] != 0){
		            res[i] = -1;
		        }
		        else{
		            res[i] = k/pip[i] - 1;
		        }
		    }
		    
		    //finding the sum of moves for case of captured
		    int sum = 0;
		    for(int i=0;i<n;i++) {
		    	if(res[i] != -1){
		    		sum = sum + res[i];
		    	}
		    }
		    
		    if(sum > 0) System.out.println(sum);
		    else System.out.println(-1);
		}
	}
}
