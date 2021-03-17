package LeetCode;

import java.util.Scanner;

public class XOROperationInAnArray1486 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        int xor = xorOperation(n,start);
        System.out.println(xor);
        sc.close();
    }

    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int xor = 0;
        for(int i=0;i<n;i++){
            nums[i] = start + 2*i;
            xor = xor ^nums[i];
        }
        return xor;
    }
}
/*
Question :-
Given an integer n and an integer start.
Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
Return the bitwise XOR of all elements of nums.
 */
/*
Example 1:
Input: n = 5, start = 0
Output: 8
Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
Where "^" corresponds to bitwise XOR operator.

Example 2:
Input: n = 4, start = 3
Output: 8
Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.

Example 3:
Input: n = 1, start = 7
Output: 7

Example 4:
Input: n = 10, start = 5
Output: 2
 */

/*
Constraints:
    1 <= n <= 1000
    0 <= start <= 1000
    n == nums.length
 */
/*
TC1:- 5 0 O/P:- 8
TC2:- 4 3 O/P:- 8
TC3:- 1 7 O/P:- 7
 */