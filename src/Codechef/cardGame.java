package Codechef;

import java.util.*;

public class cardGame
{
	//function to calculate sum of digits
	public static int sod(int n) {
		int size =0 ;
		while(n>0) {
			size = size+(n%10);
			n = n/10;
		}
		return size;
	}
	
	//main function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i =0;i<test;i++){
            int size = sc.nextInt();
            int schef = 0;
            int smorty = 0;
            for(int j =0;j<size;j++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int soa = sod(a);
                int sob = sod(b);
                if(soa > sob) schef++;
                else if(sob > soa) smorty++;
                else{
                    schef++; smorty++;
                }
            }
            if(schef > smorty) System.out.println("0 "+schef);
            else if(smorty > schef) System.out.println("1 "+smorty);
            else System.out.println("2 "+schef);
        }
    }
}