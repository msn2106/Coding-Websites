package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


/*
 * Complete the 'maximizingXor' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER l
 *  2. INTEGER r
 */

public class MaximizingXOR {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        int result = maximizingXor(l, r);

        System.out.println(result);

    }

    public static int maximizingXor(int l, int r) {
        // my approach - O(n^2)
        // int maxXor = 0;
        // for(int i=l;i<=r;i++){
        //     for(int j = l;j<=r;j++){
        //         int temp = i ^ j;
        //         if(temp > maxXor) maxXor = temp;
        //     }
        // }
        // return maxXor;

        //best approach - O(1)
        int xored  = l ^ r;
        //we find the most significant bit that can defer between the l & r
        int significantBit = 31 - Integer.numberOfLeadingZeros(xored);
        //set that bit up and subtract 1 like in example set the 4bit = 8 then -1 = 7 is the biggest number possible
        int result = (1 << (significantBit + 1)) - 1;

        return result;
    }
}
/*
11
100
O/P:-127
10
15
O/P:- 7
 */