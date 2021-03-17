package Codechef;

import java.util.Scanner;
/* Done in O(1) - 100%*/
public class IRSTXOR3L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int c = sc.nextInt();
//            long starttime = System.currentTimeMillis();
            //String bin = Integer.toBinaryString(c);
            int d = 0;
            int temp = c;
            while(temp>0){
                temp /=2;
                d++;
            }
//            System.out.println("d:"+d);
            long ul = (int)Math.pow(2,d)-1;
            long lb = ul/2;
            long ub = c^lb;
            System.out.println(ub+","+lb+","+ul);
            long product = 0;
            product = lb*ub;
            System.out.println(product);

//            for(int i=ul;i>=ul/2;i--){
//                int a = i;
//                int b = a^c;
//                if(product<(a*b) && a!=b)product=(a*b);
//                //System.out.println("a,b and product:"+a+","+b+" and " +product);
//            }
//            System.out.println((int)product);
//            long endtime = System.currentTimeMillis();
//            System.out.println("Time taken:"+((endtime-starttime)/1000)+"sec");
        }

        sc.close();
    }
}
/* TC1:
2
13
10
 */
/*
TC1 ans:
70
91
 */
/*
Key Concept:
Sum(A+B) = XOR(A+B) + 2^(A AND B)
A XOR B = C , A XOR C = B and B XOR C = A and vice versa holds
*/

/* O(n^2) approach -- TLE
for(int j=ul-1;j>=1;j--){
//System.out.println("i,j:"+i+","+j);
if((i^j)== c){
    if(product<(i*j)){
        product = i*j;
        System.out.println("Final:"+i+","+j+","+product);
        }
    }
}
*/
/*
1
999999999
2147483646
 */