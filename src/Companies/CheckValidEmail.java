package Companies;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CheckValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        boolean valid = checkemail(email);
        System.out.println("Email Valid:"+valid);
    }
    public static boolean checkemail(String email){
        boolean valid = false;
        Pattern ptr = Pattern.compile("[A-Za-z0-9._]+@[A-Za-z0-9.-]+.com");
        if(ptr.asMatchPredicate().test(email)){
            valid = true;
        }
        return valid;
    }
}

/*
23329@32434.com is not right - more breaking of pattern required
 */