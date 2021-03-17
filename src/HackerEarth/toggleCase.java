package basicIO;

import java.util.*;

class toggleCase {
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char[] ch = name.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>64 && ch[i]<92){
                ch[i] = (char)(ch[i]+32);
            }
            else if(ch[i]>96 && ch[i]<123){
                ch[i] = (char)(ch[i]-32);
            }
        }
        for(char c: ch)System.out.print(c);
        s.close();
    }
}
