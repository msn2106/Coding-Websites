package Codechef;

import java.util.Scanner;
//Accepted
public class SDICE4L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while(t-- >0){
            long n = sc.nextLong();
            long q = n/4;
            long r = n%4;

            long maxSum = 0;
            if(r==1 && q==0){
                maxSum = 20;
            }
            else if(r==2 && q==0){
                maxSum = 36;
            }
            else if(r==3 && q==0){
                maxSum = 51;
            }
            else if(r==1 && q>0){
                maxSum = q*44 + 20 + 12;
            }
            else if(r==2 && q>0){
                maxSum = q*44 + 36 + 8;
            }
            else if(r==3 && q>0){
                maxSum = q*44 + 51 + 4;
            }
            else maxSum = q*44 + 16;

            System.out.println(maxSum);
        }
        sc.close();
    }
}
/* TC:-
1
1
 */
/* TC Ans:-
20
 */