package Codechef;

import java.util.Scanner;

public class Cathief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int t = sc.nextInt();
            while (t-- >0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int K = sc.nextInt();
                int N = sc.nextInt();
                int max = x>y?x:y;
                int min = x<y?x:y;
                int caught = 0;
                while(min < max) {
                    min = min + K;
                    max = max - K;
                    if (min == max) {
                        caught = 1;
                        break;
                    }
                }
                if(caught == 1) System.out.println("Yes");
                else System.out.println("No");
            }
        }
        sc.close();
    }
}
