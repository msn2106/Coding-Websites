/*
  Program for intro to BigInteger and different functions
 */
package HackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Biginteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- >0){
            String[] s = br.readLine().split(" ");
            BigInteger a = new BigInteger(s[0]);
            BigInteger b = new BigInteger(s[1]);
            System.out.println("Addition:"+a.add(b));
            System.out.println("Subtraction:"+a.subtract(b));
            System.out.println("Multiply:"+a.multiply(b));
            System.out.println("Divide:"+a.divide(b));
            System.out.println("Remainder:"+a.remainder(b));
            BigInteger[] barr = a.divideAndRemainder(b);//new BigInteger[2];
            //barr = a.divideAndRemainder(b);//this line can directly be written as above
            for(BigInteger i:barr) System.out.println("Divide and Remainder:"+i+" ");
            System.out.println("Square Root:"+a.sqrt());
            BigInteger[] sqrt = a.sqrtAndRemainder();
            for(BigInteger i:sqrt) System.out.println("SquareRoot & Remainder:"+i);
            System.out.println("AND:"+a.and(b));
            System.out.println("OR:"+a.or(b));
            System.out.println("NOT:"+a.not());
            System.out.println("AND NOT:"+a.andNot(b));
            System.out.println("XOR:"+a.xor(b));
            System.out.println("Maximum:"+a.max(b));
            System.out.println("Minimum:"+a.min(b));
            System.out.println("GCD:"+a.gcd(b));
            System.out.println("MOD:"+a.mod(b));
            //System.out.println("MOD Inverse:"+a.modInverse(b));
            BigInteger negative = new BigInteger("-1324812312");
            System.out.println("Absolute:"+ negative.abs());
            System.out.println("Power:"+a.pow(20));
            System.out.println("Mod Power:"+a.modPow(BigInteger.valueOf(20),b));
            System.out.println("Next Probable Prime:"+a.nextProbablePrime());
            System.out.println("Shift Left:"+a.shiftLeft(2));
            System.out.println("Shift Right:"+a.shiftRight(2));
            System.out.println("Negate:"+a.negate());

            System.out.println();
            System.out.println("Bit Count:"+a.bitCount());
            System.out.println("Bit Length:"+a.bitLength());
            //System.out.println("Byte Value Exact:"+a.byteValueExact());
            System.out.println("Clear Bit:"+a.clearBit(2));
            System.out.println("Compare To:"+a.compareTo(b));
            System.out.println("Double Value:"+a.doubleValue());
            System.out.println("Equals:"+a.equals(b));
            System.out.println("Designated Bit Flipped:"+a.flipBit(1));
            System.out.println("Float Value:"+a.floatValue());
            System.out.println("Int value:"+a.intValue());
            System.out.println("Hash Code:"+a.hashCode());

            System.out.println();
            System.out.println(BigInteger.ONE.add(BigInteger.TWO).add(BigInteger.TEN).add(BigInteger.ZERO));

        }
        br.close();
    }
}
