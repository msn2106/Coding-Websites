/*
Given an integer rowIndex, return the rowIndexth row of the Pascal's triangle.
Notice that the row & col index starts from 0.
In Pascal's triangle, each number is the sum of the two numbers directly above it.
 */
package LeetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rowIndex = sc.nextInt();
        long start1 = System.currentTimeMillis();
        ArrayList<BigInteger> arr1 = getRow1(rowIndex);
        long end1 = System.currentTimeMillis();
        System.out.println(arr1);
        System.out.println("Duration:"+ (end1-start1)+"ms");

        //approach 2 - 0<= rowIndex <=40
        long start = System.currentTimeMillis();
        ArrayList<Integer> arr = getRow(rowIndex);
        long end = System.currentTimeMillis();
        System.out.println(arr);
        System.out.println("Duration:"+ (end-start)+"ms");
    }

    //function to return the rowIndex th row of the pascal's triangle
    public static ArrayList getRow1(int row){
        //approach 1 - mycode - O(~n^2) time complexity
        ArrayList<Integer> arr = new ArrayList<>();
        int r = row;
        for(int i=0;i<=r;i++){
            BigInteger temp = factorial(row).divide(factorial(i).multiply(factorial(row - i)));
            arr.add(temp.intValue());
        }
        return arr;
    }

    //fuction to calculate factorial of a given number - Approach 1
    public static BigInteger factorial(int n){
        if(n==0 || n==1)return BigInteger.ONE;
        BigInteger fact = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    //function to return the rowIndex th row of the pascal's triangle - Leet Code Solution
    public static ArrayList getRow(int row){
        //approach 2 - best approach
        ArrayList<Integer> res = new ArrayList();
        if(row < 0) return res;
        if(row==0){
            res.add(1);
            return res;
        }
        ArrayList<Integer> pre = getRow(row-1);
        res.add(1);
        for(int i=1; i<row; i++){
            res.add(pre.get(i-1)+pre.get(i));
        }
        res.add(1);
        return res;
    }
}
