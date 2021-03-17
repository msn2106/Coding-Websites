package basicIO;

import java.util.*;
class CostOfBallons {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int green = sc.nextInt();
            int purple = sc.nextInt();
            int participants = sc.nextInt();
            int[][] solution = new int[participants][2];
            for(int i=0;i<participants;i++){
                for(int j=0;j<2;j++){
                    solution[i][j] = sc.nextInt();
                }
            }

            int solFirst = 0, solSec = 0;
            for(int i=0;i<participants;i++){
                solFirst = solFirst + solution[i][0];
                solSec = solSec + solution[i][1];
            }
            int price = findPrice(green,purple,solFirst,solSec);
            System.out.println(price);
        }
        sc.close();
    }

    //function to find the least price
    public static int findPrice(int g, int p, int f, int s){
        int price = 0;
        if(f>s){
            if(g<p){
                price = f*g+s*p;
            }
            else{
                price = f*p+s*g;
            }
        }
        else{
            if(g<p){
                price = f*p+s*g;
            }
            else{
                price = f*g+s*p;
            }
        }
        return price;
    }
}
