/* Program to find maximum number of consecutive ones in an array. This program has the fastest time. */

package LeetCode;

import java.lang.*;
import java.io.*;

public class MaxConsecutiveOnes {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[]arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static  int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;        for (int i : nums) {
            if (i == 1) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                }
                if (max >= nums.length / 2) {       //if max is already greater than half of the array, there is no pt. checking
                    return max;
                }
                current = 0;
            }
        }
        return Math.max(max, current);
    }
}