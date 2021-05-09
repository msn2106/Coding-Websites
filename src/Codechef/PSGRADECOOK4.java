package Codechef;

import java.util.Scanner;

public class PSGRADECOOK4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- >0){
            int amin = sc.nextInt();
            int bmin = sc.nextInt();
            int cmin = sc.nextInt();
            int tmin = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int total = a+b+c;

            if(a >= amin && b >= bmin && c >= cmin && total >= tmin){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
