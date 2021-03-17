package GFG;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class PathThroughGraph {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger m = sc.nextBigInteger();
		BigInteger n = sc.nextBigInteger();
		
		if(m.equals(n)) {
			System.out.print(0);
			//return;
		}
		
		path(m,n);
		
		sc.close();
	}
	
	//function to find the number of nodes in path
	public static void path(BigInteger m, BigInteger n) {
		
		HashMap<BigInteger, BigInteger> hashMap = new HashMap<BigInteger, BigInteger>();
		
		BigInteger count = BigInteger.ZERO;
		while(m != BigInteger.ONE) {
			count.add(BigInteger.ONE);
			m = factor(m);
			hashMap.put(m, count);
		}
		count = BigInteger.ZERO;
		while(!hashMap.containsKey(n)) {
			count.add(BigInteger.ONE);
			n = factor(n);
		}
		System.out.print(count.add(hashMap.get(n)));
	}
	
	//function to find the greatest factor
	public static BigInteger factor(BigInteger a) {
		for(BigInteger i = BigInteger.valueOf(2); i.multiply(i).compareTo(a) < 0 ; i.add(BigInteger.ONE)) {
			if(a.mod(i).equals(BigInteger.ZERO)) {
				return a.divide(i);
			}
		}
		return BigInteger.ONE;
	}
}



//void sol(ulli x,ulli y){
//
//	if(x<y) swap(x,y);
//	map<ulli, ulli>m;
//	
//	ulli c =0;
//	while(x!=1){
//		c++;
//		x=get(x);
//		m[x]=c;
//	}
//	c=0;
//	while(!m.count(y)){
//		c++;
//		y=get(y);
//	}
//	cout<<c+m[y];
//}
