package AugustLongChallenge;

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CRDGAME3Aug20B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- >0){
		    int chef = sc.nextInt();
		    int rick = sc.nextInt();
		    int digitsForChef = 0;
		    int digitsForRick = 0;
		    if(chef >= 1 && rick>= 1){
    		    digitsForChef = findDigits(chef);
    		    digitsForRick = findDigits(rick);
		    }
		    
		    if(digitsForChef < digitsForRick){
		        System.out.println(0+" "+ digitsForChef);
		    }
		    else{
		        System.out.println(1+" "+ digitsForRick);
		    }
		}
		sc.close();
	}
	
	//function for finding the number of digits required to represent the range of power
	public static int findDigits(int n){
	    double num = 1.0*n;

	    return (int)Math.ceil(num/9);
	}
}

//this code was giving java.util.NoSuchElementException (NZEC error) in Java in Codechef
//but c++ code was accepted.
//here also it is giving right output
