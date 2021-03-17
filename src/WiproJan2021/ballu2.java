package WiproJan2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ballu2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i%2==0){
                al1.add(arr[i]);
            }
            else al2.add(arr[i]);
        }

        al1.addAll(al2);
        for(int i=0;i<n;i++){
            arr[i] = al1.get(i);
        }

        for(int i:arr) System.out.print(i+" ");
    }
}

/*
6
6 9 10 4 2 11
6
7 3 8 1 9 5
7
5 1 7 4 2 8 9
 */