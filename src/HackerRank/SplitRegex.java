package HackerRank;
import java.util.Scanner;

public class SplitRegex {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        // Write your code here.
        if(s.length()==0){                  //this is for 0 length string
            System.out.println(0);
            return;
        }
        String[] arr = s.split("[!?._'@, -]+");
        System.out.println(arr.length);
        for(String str:arr)System.out.println(str);
        scan.close();
    }
}
/*
Two thing I learned:
1.) In the TC see, after "," there is a space >>boy, << here. This results in gap of two lines.
Which was resolved by the "+" in the end.
2.) Such type of question - trim() initially.
 */
/* TC:
He is a very very good boy, isn't he?
 */
/* Ans:
10
He
is
a
very
very
good
boy
isn
t
he
 */