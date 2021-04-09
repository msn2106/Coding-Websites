package Codechef;

import java.util.Scanner;

public class SSCRIPT4L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0){
                int n = sc.nextInt();
                int k = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();

                //solution starts here
                long startTime = System.currentTimeMillis();
                //  char[] ch = new char[k];
                //  Arrays.fill(ch,"*");
                //  String star = new String(ch);
                //  String star = new String(new char[k]).replace('\0', '*');
                StringBuilder str = new StringBuilder();
                StringBuilder star = new StringBuilder("*");
                for(int i=0;i<k;i++){
                    str = str.append(star);
                }

                if(str.length() < star.length()){
                    System.out.println("NO");
                    return;
                }
                for(int i=0;i<str.length()-k;i++){

                }

            }
        }
        sc.close();
    }
}
/*
3
5 2
*a*b*
5 2
*a**b
5 1
abcde
 */