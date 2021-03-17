package Codechef;

import java.util.Scanner;

public class CVDRUN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                int x = sc.nextInt();
                int y = sc.nextInt();

                boolean infected = cvdrun(n,k,x,y);
                if(infected)System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }

    static boolean cvdrun(int n, int k, int x, int y){
        boolean infected = false;
//        for (int i = 0; i <= x; i+=k) {
//            if((x+i)%n == y){
//                //System.out.println(i*k);
//                infected = true;
//                break;
//            }
//        }
        int newv = Math.abs(x-y);
        if(newv % k ==0) infected = true;
        else infected = false;
        return  infected;
    }
}
/*2
6 2 5 3
12 3 4 2
* */