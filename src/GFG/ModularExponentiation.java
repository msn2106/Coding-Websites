package GFG;

// Iterative Java program to compute modular power

public class ModularExponentiation
{

    /* Iterative Function to calculate (x^y) in O(log y) */
    static long power(long x, long y, long p)
    {
        long res = 1; // Initialize result

        x = x % p; // Update x if it is more than or equal to p

        if (x == 0)
            return 0; // In case x is divisible by p;

        while (y > 0)
        {
            // If y is odd, multiply x with result
            if ((y & 1) != 0)
                res = (res * (x%p)) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = ((x%p) * (x%p)) % p;
        }
        return res;
    }

    // Driver Code
    public static void main(String[] args)
    {
        long base = 2;
        long power = 100000;
        //long power = 34;
        System.out.print("Power is " + power(base, power-1, 1000000007));
    }
}

// Copied from GFG - Similar Question May Long Challenge XOREQUAL