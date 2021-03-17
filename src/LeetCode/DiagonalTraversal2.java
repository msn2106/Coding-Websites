/*This is a program for zig-zag printing of matrix.*/

package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DiagonalTraversal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr = new int[rows][col];

        for(int i=0;i<rows;i++){
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int[] i:arr) System.out.print(Arrays.toString(i)+" ");
        System.out.println();

        int[] res = zigzag1(arr);
        System.out.println(Arrays.toString(res));

    }

    public static int[] zigzag1(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int diag = m+n-1;
        int[] res = new int[m*n];
        int x = 0;
        for (int i = 0; i < diag; i++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int start_row = m-i>0?i:m-1;
            int start_col = m-i>0?0:i-m+1;
            while(start_row >= 0 && start_col < n){
                arr.add(mat[start_row--][start_col++]);
            }
            if(i %2!=0){
                Collections.reverse(arr);
            }
            for(int y:arr){
                //System.out.print(x+","+y+">");
                res[x++] = y;
            }
        }
        return res;
    }
}
/*
4
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
 */
/*
Key Points:-
1) Same as diagonalTraversal1 we have to travel matrix for every diagonal.
2) Start row and start column is also in same way.
3) New thing added is > reversing a particular diagonal elements based on its column index (like even or odd)
4) There is one more way, by directly obtaining the start_row and start_col and skipping the reversing process > but that is difficult.
 */