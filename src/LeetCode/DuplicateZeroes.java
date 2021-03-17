/*Program for inserting another zero if a zero is found in between the array.*/
package LeetCode;

public class DuplicateZeroes {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,9,0,0};
        duplicateZeros(arr);
        for(int i:arr) System.out.print(i+" ");

    }

    public static void duplicateZeros(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==0){
                for(int j=arr.length-2;j>i;j--){
                    arr[j+1]=arr[j];
                }
                arr[i+1]=0;
                i++;
            }
        }
    }
}
/* TC1: - [1,0,2,3,0,4,5,0]*/
