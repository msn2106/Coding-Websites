package GFG;

import java.util.Scanner;

public class BitCountOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();

            int noOfOne = noOfOne(n);
            System.out.println(noOfOne);

            int noOfOneBitwise = noOfOneBitwise(n);
            System.out.println(noOfOneBitwise);
        }
    }

    //function to find no. of one in binary representation of a no.
    // or count of no. of set bits - traverse whole number
    // complexity - logN
    public static int noOfOne(int n){
        int count = 0;
        while(n !=0){
            if((n & 1) == 1)count++;
            n = n>>1;
        }
        return count;
    }

    // function to find no. of one in binary representation of a no.
    // or count of no. of set bits - uses n & n-1 concept
    //complexity - reduced to number of set bits in binary form
    public static int noOfOneBitwise(int n){
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count++;
        }
        return count;
    }
}
