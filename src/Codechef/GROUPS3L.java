package Codechef;

import java.util.Scanner;

public class GROUPS3L {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int t = Integer.parseInt(sc.nextLine());
            while (t-- > 0) {
                String s = sc.nextLine();
                //codechef video approach
                int i=0,count=0;
                char[] ch = s.toCharArray();
                while(i<ch.length){
                    if(ch[i]=='0'){
                        i += 1;
                    }
                    else{
                        count++;
                        i++;
                        while (i<ch.length && ch[i]=='1'){
                            i++;
                        }
                    }
                }
                System.out.println(count);
            }
            sc.close();
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }
}

/*
4
000
010
101
01011011011110
 */
/* answer
0
1
2
4
 */

/* 1st approach - incorrect
//                if(ch.length==1){
//                    if(ch[0]=='1')count = count+1;
//                    System.out.println(count);
//                    break;
//                }
//                else{
//                    for (int i = 0; i < ch.length; i++) {
//                        if (ch[i] == '1') {
//                            for (int j = i + 1; j < ch.length; j++) {
//                                if (ch[j] == '1') {
//                                    group++;
//                                } else {
//                                    count++;
//                                    i += group;
//                                    break;
//                                }
//                            }
//                        }
//                    }
//                    if(group==ch.length)count++;
//                }
//
//                if (ch[ch.length - 2] == '0') {
//                    if (ch[ch.length - 1] == '1') count++;
//                }
 */

/* 2nd approach - correct
//                int count = 0;
//                String[] arr = s.split("0");
//                count = arr.length;
//                for(int i=0;i<arr.length;i++){
//                    if(arr[i].equals(""))count--;
//                }
//                System.out.println(count);
 */