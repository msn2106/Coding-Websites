package Codechef;

import java.util.Scanner;

public class HDIVISR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        while(sc.hasNextInt()){
//        }
        int n = sc.nextInt();
        int var = 0;
        for(int i=10;i>0;i--){
            if(n%i==0){
                var = i;
                break;
            }
        }
        System.out.println(var);
        sc.close();
    }
}
