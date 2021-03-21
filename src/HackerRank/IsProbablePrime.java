package HackerRank;

import java.util.*;
import java.math.BigInteger;

class isProbablePrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        BigInteger b = new BigInteger(n);
        if(b.isProbablePrime(1)){
            System.out.println("prime");
        }
        else System.out.println("not prime");
        scanner.close();
    }
}

//isProbablePrime(int certainty) is a method of BigInteger Class
//certainty between 0 to 1 shows the percentage of certain we need to be about the number being prime
//if we want it to be surely prime that it is kept as 1.

/*
2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251982
 */
/*
2367495770217142995264827948666809233066409497699870112003149352380375124855230068487109373226251983
 */