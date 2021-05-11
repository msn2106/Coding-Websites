package Codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XOREQUAL5L {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int m = (int)Math.pow(10,9) + 7;
        while(t-- >0){
            int n = Integer.parseInt(br.readLine());
            long res = pow(2,n-1,m);
            System.out.println(res);
        }
        br.close();
    }

    static long pow(int x, int y, int p)
    {
        long res = 1; // Initialize result

        x = x % p; // Update x if it is more than or
        // equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (y > 0)
        {

            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }
        return res;
    }
}
//Java Code was not submitted it gave incorrect answer ...similar code worked for cpp.
//BigInteger implementation was perfect but it gave TLE...don't know why