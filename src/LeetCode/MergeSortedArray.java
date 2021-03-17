/*Program to merge to sorted array. Provided array 1 is of enough size to accomodate both.*/
package LeetCode;
import java.util.*;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;  //no. of non-zero elements in the array.
        int n = 3;
        merge(nums1,m,nums2,n);
        for(int i:nums1) System.out.print(i+" ");
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=m,j=0;(i<m+n) && j<n;i++,j++){
            nums1[i]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}
