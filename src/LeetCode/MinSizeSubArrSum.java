/*
Given an array of n positive integers and a positive integer s, find the minimal length of a
 contiguous subarray of which the sum ≥ s. If there isn't one, return 0 instead.
 */
package LeetCode;
import java.util.Arrays;
import java.util.Scanner;
public class MinSizeSubArrSum {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
        int[] arr = {2,3,1,2,4,3};//new int[s];
//        for (int i = 0; i < s; i++) {
//            arr[i] = sc.nextInt();
//        }

        int target = 7;//sc.nextInt();
        int minSizeSubArray = minSubArrayLen(target,arr);
        //int minSizeSubArray = minsarr(target,arr);
        System.out.println(minSizeSubArray);
        //sc.close();
    }

    //function to return the length of minimum size contiguous subarray forming the sum >= target sum.
    public static int minSubArrayLen(int s, int[] nums) {
        if(nums.length == 0)return 0;
        int mincount = Integer.MAX_VALUE;
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=s){
                return 1;
            }
            int sum = 0;
            for(int j=i+1;j<nums.length;j++){
                sum += nums[j];
                if(sum+nums[i]>=s){
                    temp = j-i;
                    break;
                }
            }

            mincount = mincount<temp?mincount:temp;
        }
        if(mincount == 0) return 0;
        return mincount+1;
    }
}
/*
Input: s = 7, nums = [2,3,1,2,4,3]
Output: 2
Explanation: the subarray [4,3] has the minimal length under the problem constraint.
 */
/*
Above solution is O(n^2)
There are two more solutions possible - O(n) and O(nlogN)- Try those.
 */