package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class RelativeSortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int s1 = sc.nextInt();
//        int s2 = sc.nextInt();
//        int[] arr1 = new int[s1];
//        int[] arr2 = new int[s2];
//        for(int i=0;i<s1;i++){
//            arr1[i] = sc.nextInt();
//        }
//        for(int i=0;i<s2;i++){
//            arr2[i] = sc.nextInt();
//        }

        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        int [] relsortedarray = relativeSortArray(arr1,arr2);
        for(int a:relsortedarray) System.out.print(a+" ");
        //System.out.println(Arrays.asList(relsortedarray));
        sc.close();
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    arr1[j] = -1;
                }
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=-1){
                arr.add(arr1[i]);
            }
        }
        Collections.sort(arr);
        System.out.println("Sorted:"+arr);
        int val = arr2[0];
        int index = 0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>val){
                index = i;
                break;
            }
        }
        arr = insertAt(arr,index,arr2);
        int[] finalarr = new int[arr.size()];
        int y = 0;
        for(int x:arr)finalarr[y++] = x;
        return finalarr;
    }

    public static ArrayList insertAt(ArrayList arr,int j,int[] arr2){
        for(int i=0;i<arr2.length;i++){
            arr.add(j+i,arr2[i]);
        }
        //System.out.println("InsertAt"+arr);
        return arr;
    }
}

//incorrect
//ordering should be like arr2 ie; its trend should be followed and those elements which
// are not in arr2 should be added in ascending order in end.
// count of variables should be used.
//ie; every no. in arr2 have all the matching numbers in arr1 arranged together.