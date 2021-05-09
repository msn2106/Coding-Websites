package Codechef;

import java.util.Scanner;

public class HIRETESTSTARTER4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int candidates = sc.nextInt();
            int questions = sc.nextInt();
            int complete = sc.nextInt();
            int partial = sc.nextInt();
            sc.nextLine();
            String result = "";
            String pass = "";
            for (int i = 0; i < candidates; i++) {

                String answers = sc.nextLine();
                char[] ch = answers.toCharArray();

                pass = fulfill(complete,partial,ch);
                //System.out.println(pass);
                result += pass;
                //System.out.println(result);
            }
            System.out.println(result);
        }
        sc.close();
    }

    static String fulfill(int complete,int partial, char[]ch){
        String pass = "0";
        int f = 0, p = 0;
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] == 'F')f++;
            else if(ch[i] == 'P')p++;
        }
        if(f >= complete) return "1";
        else if((f == complete-1) && p >= partial) return "1";
        return pass;
    }
}

/*
3
4 5
3 2
FUFFP
PFPFU
UPFFU
PPPFP
3 4
1 3
PUPP
UUUU
UFUU
1 3
2 2
PPP
 */
