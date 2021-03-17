package AugustLongChallenge;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class LINCHESSAug20B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int[] p = new int[n];
		    for(int m = 0; m < n; m++){
		        p[m] = sc.nextInt();
		    }
		    
		    //whether the player can capture? if yes, how many steps.
		    int res[] = new int[n];
		    for(int i=0;i<n;i++){
		        if(k%p[i] != 0){
		          res[i]=Integer.MAX_VALUE;  
		        } 
		        else{
		           res[i] = k/p[i] -1;
		        }
		    }
		    
		    //checking if number of steps is equal to initial position + that no. of steps
			//if a is the initial position then player can move from a + a steps at most
			for(int i=0;i<n;i++){
			    if(res[i] > p[i]) res[i] = Integer.MAX_VALUE;
			}
		    
		    //finding player with minimum no. of steps
		    int min = res[0];
		    int index = 0;
		    for(int i=0;i<n;i++){
		    	if(min == Integer.MAX_VALUE) index = -1;
		        if(res[i] < min) {
		        	min = res[i];
		        	index = i;
		        }
		    }
		    
		    if(index == -1) System.out.println(-1);
		    else System.out.println(p[index]);
		}
		sc.close();
	}
}
/* 2
4 6
4 3 2 8
4 7
4 3 2 8*/

