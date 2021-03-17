package basicIO;

import java.util.*;
class PalindromeString {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String  st = sc.nextLine();
        boolean isPalindrome = checkPalindrome(st);
        if(isPalindrome) System.out.println("YES");
        else System.out.println("NO");
        sc.close();
    }

    //function to check palindrome
    public static boolean checkPalindrome(String st){
        for(int i=0;i<st.length()/2;i++){
            if(st.charAt(i) != st.charAt(st.length()-1-i))return false;
        }
        return true;
    }
}
