package GFG;

import java.util.Scanner;

public class NoOfDigitsInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int n = sc.nextInt();

            int noOfDigitsInBinaryOfN = noOfDigitsInBinary(n);
            System.out.println(noOfDigitsInBinaryOfN);
            System.out.println(Integer.toBinaryString(n));

            int noOfDigitsInDecimal = noOfDigitsInDecimal(n);
            System.out.println(noOfDigitsInDecimal);
        }
    }

    //function to find no of digits in binary representation of a decimal number
    public static int noOfDigitsInBinary(int n){
        int res = (int)(Math.log(n)/Math.log(2));
        return res+1;
    }

    //function to find no. of digits in decimal representation of a decimal number
    // unlike using while loop to find the size of number
    public static int noOfDigitsInDecimal(int n){
        int res = (int)Math.log10(n);
        return res+1;
    }
}

//formula used :-
//loga b = log10 b / log10 a
//log2 N = log10 N / log10 2
