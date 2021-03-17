package gfgForkJava;

//import java.io.*;
import java.util.*;

class Geeks{
	static void IOFunction() {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		while(t-- >0) {
			int a = scanner.nextInt();
			float b = scanner.nextFloat();
			long c = scanner.nextLong();
			byte d = scanner.nextByte();
			scanner.nextLine();                     //the emphasis is on this line. 
			String string = scanner.nextLine();
			scanner.close();
			
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(string);
			
			
		}
	}
}
public class TakingInput{
	public static void main(String[] args) {
		Geeks.IOFunction();
	}
}
//Because method nextLine() reads next symbols from current current line after cursors current position.