package GFG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class euclidGCD {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String[] input = br.readLine().trim().split(" ");
            long a = Long.parseLong(input[0]);
            long b = Long.parseLong(input[1]);

            long startTime1 = System.currentTimeMillis();
            long res1 = gcdEuclid(a,b);
            long endTime1 = System.currentTimeMillis();
            System.out.println(res1);
            System.out.println("Time Euclid:"+(endTime1-startTime1));

            long startTime2 = System.currentTimeMillis();
            long res2 = gcd(a,b);
            long endTime2 = System.currentTimeMillis();
            System.out.println(res2);
            System.out.println("Time:"+(endTime2-startTime2));
        }
        br.close();
    }

    //normal gcd - O(min(a,b))
    public static long gcd(long a, long b){
        long min = Math.min(a,b);
        for (long i = min; i > 1; i--) {
            if(a%i == 0 && b%i == 0) return i;
        }
        return 1;
    }

    //euclid gcd
    public static long gcdEuclid(long a, long b){
        return b == 0 ? a : gcdEuclid(b,a%b);
    }
}
