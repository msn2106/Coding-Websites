package Companies;

import java.util.Scanner;

public class TCSNQT3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            String key = sc.nextLine();
            int blankkey=0;
            for(int i=0;i<key.length();i++){

                if(key.charAt(i)==' ') {
                    blankkey++;
                }
            }
            char[] k = key.toCharArray();
            String[] totalkeys = key.split(" ");
            int tkey = totalkeys.length;

            int lock = tkey - blankkey;
            System.out.println("BLANK KEYS:"+blankkey);
            System.out.println("TOTAL KEYS:"+tkey);
            System.out.println("NUMBER OF LOCKS:"+lock);
            char ch = sc.next().charAt(0);
            if(ch == 'q') break;
        }
    }

    public static int countDuplicates(String[] key) {
        int i=0;
        int duplicate = 0;
        for(int j=1;j<key.length;j++){
            if(key[j] != key[i]){
                duplicate++;
            }
        }
        return duplicate;
    }
}
//not sure of working