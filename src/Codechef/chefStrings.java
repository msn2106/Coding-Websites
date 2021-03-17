package JulyLongChallenge;

import java.util.Scanner;
class chefStrings
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i< test; i++){
            int size = sc.nextInt();
            int[] arr = new int[size];
            for(int j = 0;j<size;j++){
                arr[j] = sc.nextInt();
            }
            //solution
            int sol[] = new int[size-1];
            int res=0;
            for(int k=0;k<size-1;k++){
            	sol[k]= Math.abs(arr[k+1]-arr[k])-1;
            	res = res + sol[k];
            }
            System.out.println(res);
        }
        sc.close();
    }
}
/* Test Case
2
6
1 6 11 6 10 11
4
1 3 5 7
*/
/* Partially approved- time */