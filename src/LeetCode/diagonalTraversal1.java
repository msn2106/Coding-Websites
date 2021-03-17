/*Program for diagonal traversal in a matrix*/
/*There can be multiple ways of matrix printing some of which are below.*/
package LeetCode;
import java.util.*;
public class diagonalTraversal1 {
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
        printMatrix1(arr);
        System.out.println();
        printMatrix2(arr);
        System.out.println();
//        printmat(arr);
//        System.out.println();
        printMatrix3(arr);
        System.out.println();
        sc.close();
    }
    //function to print from top left to bottom right.
    public static void printMatrix1(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m + n - 1; i++) {
            int start_row = i < m ? i : m - 1;
            int start_col = i < m ? 0 : i - m + 1;
            while (start_row >= 0 && start_col < n) {
                System.out.print(matrix[start_row--][start_col++]+" ");
            }
            //System.out.println();
        }
    }

    //function to print from bottom right to top left
    public static void printMatrix2(int[][] mat){
        int m = mat.length; int n = mat[0].length;
        int i,j,k;
        for (i = m-1; i >= 0 ; i--) {
            k = i;
            j = n-1;
            while(k<m){
                System.out.print(mat[k++][j--]+" ");
            }
        }
        for (i = n-2;  i>=0 ; i--) {
            k = 0;
            j = i;
            while(j>=0){
                System.out.print(mat[k++][j--]+" ");
            }
        }
    }
    //expanded printmatrix1 function
    public static void printmat(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int i,j,k;
        for (i = 0; i < m; i++) {
            k = i;
            j = 0;
            while(k>=0){
                System.out.print(mat[k--][j++]+" ");
            }
        }
        for ( i = 1; i < n; i++) {
            k = m-1;
            j = i;
            while(j<n){
                System.out.print(mat[k--][j++]+" ");
            }
        }
    }

    //function to traverse from top left to bottom right corner(arrow direction)
    public static void printMatrix3(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        int diagonals = m+n-1;
        int i,j,k;
        for (i = n-1; i >= 0; i--) {
            k = 0;
            j = i;
            while(j<n && k<m){
                System.out.print(mat[k++][j++]+" ");
            }
        }
        for (i = 1; i < m; i++){
            k = i;
            j = 0;
            while(k<m){
                System.out.print(mat[k++][j++]+" ");
            }
        }
        System.out.println();
        for(i = 0; i <= diagonals; i++){
            int start_row = n-i>0?0:i-m;        //in this case the start_row for n-1 to 0 has value 0, then the first column in incremental order.
            int start_col = n-i>0?n-i-1:0;      //start_col has initially decreasing value till fir row , then has 0 value for first column.
            while(start_row<m && start_col<n){
                System.out.print(mat[start_row++][start_col++]+" ");
            }
        }
    }
}
/*
TC1:
4
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
*/
/*
TC2:
2
2
2 5
7 4
*/
/*
3
3
1 2 3
4 5 6
7 8 9
*/

/*
Key points:
1) Any traversal can be made using 2 for loops
2) If there are "m" rows and "n" columns, then there can are "m+n-1" diagonals possible.
3) The basic objective here to to traverse every diagonal and print element along it.
4) A matrix can be divided into two segments, based on the half section(check above example)
5) For loops decides the initial and final position of main pointer.
6) Inside for loop a while loop runs (which prints every element possible along that diagonal)
7) The value of row and column is incremented or decremented a/c to condition inside for loop. (i.e., till one of them
is less than equal to row numbers or column nos.)
8) The start_row and start_col is updated every time through the outer for loop. And inside the start_row and column is
maintained according to condition.
9) Based on those conditions the while loop runs.
 */