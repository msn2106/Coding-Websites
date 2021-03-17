package Codechef;

import java.util.Scanner;

public class Sdstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int t = Integer.parseInt(sc.nextLine());
            while (t-- >0){
                String str = sc.nextLine();
                //int minsteps = minreducesteps(str);
                //System.out.println(minsteps);
            }
        }
        sc.close();
    }

    public static void minreducesteps(String str){
        int l = str.length();
        if(l%2 != 0)return ;
        else{
            for(int i=0;i<l;i++){
                for(int j=i+1;j<l;j++){
                    if(str.charAt(i) != str.charAt(j)){
                        str = str.substring(0,i)+str.substring(j+1);
                    }
                }
            }
        }
    }
}
