package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseStringWithSpacePreserved {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String s = br.readLine();
            s = reverseWithSpaceIntact(s);
            System.out.println(s);
        }
        br.close();
    }

    static String reverseWithSpaceIntact(String S){
        int n = S.length();
        int start = 0;
        int end = n-1;
        char[]  res = S.toCharArray();
        while(start < end){
            if(res[start] == ' '){
                start++;
                continue;
            }
            else if(res[end] == ' '){
                end--;
                continue;
            }
            else{
                char temp = res[start];
                res[start] = res[end];
                res[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(res);
    }
}

