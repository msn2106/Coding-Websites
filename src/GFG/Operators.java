package GFG;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 60;
        int b = 13;
        System.out.println("Int to Binary:"+Integer.toBinaryString(a));
        System.out.println("Int to Binary:"+Integer.toBinaryString(b));
        System.out.println();

        int compliment = ~a;
        System.out.println("Compliment of 60:"+compliment);
        System.out.println();
        System.out.println("Bitwise Operators");
        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        System.out.println("60 & 13: "+and);
        System.out.println("60 | 13: "+or);
        System.out.println("60 ^ 13: "+xor);
        System.out.println();

        System.out.println("Shift Operators");
        int leftShift = a << 2;
        int rightShift = a >> 2;
        int shiftRightZeroFill = a >>> 2;
        int shiftLeftZeroFill = b << 2;
        System.out.println("60 << 2: "+leftShift);
        System.out.println("60 >> 2: "+rightShift);
        System.out.println("60 >>> 2: "+shiftRightZeroFill);
        System.out.println("13 << 2: "+shiftLeftZeroFill);
        System.out.println();

        System.out.println("Logical Operators");
        boolean x = true;
        boolean y = 9<5;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println();

        sc.close();
    }
}
/*
Broadly classifying 8 types of operators are there:-
1) Unary
    A) Postfix - x++ , x--
    B) Prefix - ++x , --x
    C) Compliment - ~x
2) Arithemetic
    A) a+b
    B) a-b
    C) a*b
    D) a/b
    E) a%b
3) Shift
    A) Left Shift - <<
    B) Right Shift -  >>
    C) Right Shift with zeros - >>>
4) Relational
    A) Comparison - > , < , >= , <=, instanceOf
    B) Equality - = , !=
5) Bitwise
    A) Bitwise and - a & b
    B) Bitwise or - a | b
    C) Bitwise Xor - a ^ b
6) Logical
    A) Logical and - boolean && boolean
    B) Logical or - boolean || boolean
    C) Logical not - !boolean
7) Ternary
    (boolean)? true : else
8) Assignment
    = , += , -=, *=, /= , %=, &= , |= , ^= , <<= , >>= , >>>=
 */