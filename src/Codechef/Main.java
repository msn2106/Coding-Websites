/** This is a program to sort nextInt and next and nextLine command
 * 
 */
package Codechef;
import java.util.Scanner;
/**
 * @author msn21
 *
 */
public class Main {

	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        //sc.nextLine();	//this line does not make any difference
        while(test-- >0){
            int k = sc.nextInt();
            //sc.nextLine();			//as both int and string are on same line
            String[] arr = new String[k];
            for(int i=0;i<k;i++){
                arr[i] = sc.next();		//as we need space separated tokens only
            }
            
            for(String s: arr) System.out.print(s+" ");
            System.out.println();
        }
        sc.close();
    } 
}
