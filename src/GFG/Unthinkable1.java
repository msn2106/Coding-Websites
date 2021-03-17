/** This is a program to find the sum of MegaPrime between a given range of numbers.
 * MegaPrime here are those numbers which are prime and whose individual digits are also prime.
 * 
 */
package company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author msn21
 *
 */
public class Unthinkable1 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int l = sc.nextInt();

        ArrayList prime = primeBetween(f,l);
        //System.out.println(prime);
        ArrayList megaPrime = megaPrime(prime);
        //System.out.println(megaPrime);
        Integer sum = sumMegaPrime(megaPrime);

        System.out.println(sum);
    }

    //function to check prime
    public static boolean checkPrime(int num){
        boolean isPrime = true;
        if(num == 1 || num ==0) isPrime = false;
        for(int i = 2;i<=num/2;i++){
            if(num % i == 0) isPrime = false;
        }
        return isPrime;
    }

    //function to find prime number between f and l inclusive
    public static ArrayList primeBetween(int f,int l){
        ArrayList<Integer> prime = new ArrayList<>();
        for(int i=f;i<=l;i++){
            if(checkPrime(i)) prime.add(i);
        }
        return prime;
    }

    //function to check and return megaprime
    public static ArrayList megaPrime(ArrayList prime){
        ArrayList<Integer> mprime = new ArrayList<>();
        for(int i=0;i<prime.size();i++){
            Integer temp = (Integer)prime.get(i);
            Integer num = temp;
            boolean isMprime = true;
            Integer digit = 0;
            while(temp >0){
                digit = temp % 10;
                isMprime = checkPrime(digit);
                temp = temp/10;

                if(!isMprime){
                    break;
                }
            }
            if(isMprime) mprime.add(num);
        }
        return mprime;
    }

    //function to return sum of megaprimes
    public static Integer sumMegaPrime(ArrayList mprime){
        Integer sum = 0;
        for(int i=0;i<mprime.size();i++) {
        	sum = sum + (Integer)mprime.get(i);
        }
        return sum;
    }
}
