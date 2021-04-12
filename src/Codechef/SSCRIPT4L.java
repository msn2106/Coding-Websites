package Codechef;

import java.util.Scanner;

public class SSCRIPT4L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-- >0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                sc.nextLine();
                String s = sc.nextLine();
                char[] ch = s.toCharArray();
                int[] arr = new int[ch.length];

                for(int i=0;i<ch.length;i++){
                    if(ch[i]=='*'){
                        ch[i] = '1';
                    }
                    else ch[i]='0';
                }

                arr[0] = Integer.parseInt(String.valueOf(ch[0]));
                for(int i=1;i<n;i++){
                    arr[i] = arr[i-1]+ Integer.parseInt(String.valueOf(ch[i]));
                }

                int sum = 0,flag = 0;
                for(int i=0; i+k-1 < n; i++){
                    sum = arr[i+k-1] - ((i == 0 ? 0 : arr[i-1]));
                    if(sum >= k){
                        System.out.println("YES");
                        flag = 1;
                        break;
                    }
                }
                if(flag == 0)System.out.println("NO");
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
//Watched it from CodeChef video tutorials