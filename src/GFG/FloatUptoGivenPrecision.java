package gfgForkJava;

import java.util.Scanner;

public class FloatUptoGivenPrecision {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int test = scanner.nextInt();
		while(test-- >0) {
			float a = scanner.nextFloat();
			float b = scanner.nextFloat();
			float f = a/b;
			System.out.printf("%f    %20.3f",f,f);
		}
		scanner.close();
	}
}
//20 provides space ahead and 3 provides after decimal precision