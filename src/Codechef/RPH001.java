/* Program using BigInteger and its function on CodeChef with name RPH001*/
package Codechef;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //int t = Integer.parseInt(br.readLine());
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t-->0){
                //String[] input = br.readLine().split(" ");
                StringBuilder[] sba  = new StringBuilder[2];    //StringBuilder array for input for ease in reversing the string.
                //sba[0] = new StringBuilder(input[0]);
                //sba[1] = new StringBuilder(input[1]);
                sba[0] = new StringBuilder(sc.next());          //taking input of string in StringBuilder directly
                sba[1] = new StringBuilder(sc.next());
                BigInteger a = new BigInteger(String.valueOf(sba[0].reverse()));    //reversing the String and then converting to BigInteger.
                BigInteger b = new BigInteger(String.valueOf(sba[1].reverse()));
                BigInteger c = a.add(b);
                StringBuilder result = new StringBuilder(String.valueOf(c));
                result = result.reverse();
                String wzero = result.toString();
                //removing leading zeros from the result
                for(int i=0;i<wzero.length();i++){
                    if(wzero.charAt(i)!= '0'){
                        result = new StringBuilder(wzero.substring(i));
                        break;
                    }
                }
                System.out.println(result);
//                String f = "0033485703490734095673490098823095732905720";
//                String res ="";
//                for(int i=0;i<f.length();i++){
//                    System.out.println(f.charAt(i));
//                    if(f.charAt(i)!='0'){
//                        res = f.substring(i);
//                        break;
//                    }
//                }
//                System.out.println("this is:"+res);
            }
        }
        //br.close();
        sc.close();
    }
}
