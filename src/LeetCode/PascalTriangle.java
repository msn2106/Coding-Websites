package LeetCode;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        //my method
        long starttime = System.nanoTime();
        List<List<Integer>> ls = pascaltriangle(rows);
        long endtime = System.nanoTime();
        System.out.println(ls);
        System.out.println("Duration:"+(endtime-starttime));

        //leet code's method
        starttime = System.nanoTime();
        List<List<Integer>> gs = generate(rows);
        endtime = System.nanoTime();
        System.out.println(gs);
        System.out.println("Duration:"+(endtime-starttime));
        sc.close();
    }

    //function to generate pascal triangle for given number of rows
    public static List<List<Integer>> pascaltriangle(int rows){ //7ms
        List<List<Integer>> ls = new ArrayList<>();
        //combination method
        for (int i = 0; i < rows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i+1; j++) {
                BigInteger val = factorial(i).divide(factorial(j).multiply(factorial(i-j)));
                temp.add(Integer.parseInt(String.valueOf(val)));
            }
            ls.add(temp);
        }
        return ls;
    }

    public static BigInteger factorial(int n){
        if(n==0 || n==1)return BigInteger.ONE;
        //return n * factorial(n-1);
        BigInteger val = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            val = val.multiply(BigInteger.valueOf(i));
        }
        return val;
    }

    public static List<List<Integer>> generate(int numRows) { //1ms
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0) return res;
        if(numRows == 1) {
            res.add(new ArrayList<>(Arrays.asList(1)));
            return res;
        }
        if(numRows == 2) {
            res.add(new ArrayList<>(Arrays.asList(1)));
            res.add(new ArrayList<>(Arrays.asList(1,1)));
            return res;
        }

        res.add(new ArrayList<>(Arrays.asList(1)));
        res.add(new ArrayList<>(Arrays.asList(1,1)));

        int i = 2;
        while(i < numRows) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for(int j = 1; j < i; j++) {
                temp.add(res.get(i-1).get(j-1) + res.get(i-1).get(j));
            }
            temp.add(1);
            res.add(temp);
            i++;
        }
        return res;
    }
}
/*
Key Points:-
1) Pascal triangle columns values are equal to 11^row no(from 0), but this does not work for row > 4
2) For finding element in mth row and nth column = m!/(n!*(m-n)!)
3) First element of every column is 1. And second element is counting no. (row no.) , third follow triangular no, fourth tetrahedral no. and so on..
4) Pascal triangle is symmetric in nature.
5) It also represents fibonacci representation and probability distribution {Check :- https://www.mathsisfun.com/pascals-triangle.html}
 */