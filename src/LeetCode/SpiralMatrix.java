/* Program to print matrix in spiral order*/
package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
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

        List<Integer> ls = spiral(arr);
        System.out.println(ls);
    }

    public static List<Integer> spiral(int[][]mat){
        int m = mat.length;
        int n = mat[0].length;
        //int[] res = new int[m*n];
        List<Integer> ls = new ArrayList<>();
        int x = 0;
        int i,k=0,l=0;
        int lastrow = m-1;
        int lastcol = n-1;
        while(k<=lastrow && l<=lastcol){
            for(i=l;i<=lastcol;i++){
                //res[x++] = mat[k][i];
                ls.add(mat[k][i]);
            }
            k++;
            for(i=k;i<=lastrow;i++){
                //res[x++] = mat[i][lastcol];
                ls.add(mat[i][lastcol]);
            }
            lastcol--;
            if(k<=lastrow){
                for(i=lastcol;i>=l;i--){
                    //res[x++]=mat[lastrow][i];
                    ls.add(mat[lastrow][i]);
                }
                lastrow--;
            }
            if(l<=lastcol){
                for(i=lastrow;i>=k;i--){
                    //res[x++]=mat[i][l];
                    ls.add(mat[i][l]);
                }
                l++;
            }
        }
        return ls;
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
3
3
1 2 3
4 5 6
7 8 9
 */