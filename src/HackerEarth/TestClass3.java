package DSACodingContest;

import java.util.Scanner;

public class TestClass3 {
	
	//function to calculate factorial
	static int fact(int n) {
		int fact = 1;
		if(n==0) return 0;
		else if(n==1) return 1;
		else {
			for(int i=2;i<=n;i++) {
				fact = fact*i;
			}
			return fact;
		}
	}

	//function to calculate numerator of combination
	static int ntoi(int n, int i) {
		int prod = 1;
		if(n==0) return 0;
		else if(n==1) return 1;
		else {
			for(int k=0;k<i;k++) {
				prod = prod*n;
				n--;
			}
			return prod;
		}
	}
	
	//function to calculate total regular polygon possible for a number
	static int fig(int n) {
		int fig = 0;
		for(int i= 3;i<=n;i++) {
			fig = fig+ ntoi(n, i)/fact(i);
		}
		return fig;
	}
	
	//function to find distinct elements in an array
	static int[] distinct(int[] arr) {
		int s = arr.length;
		int res[] = new int[s];
		for(int i=0;i<s;i++) {
			boolean isDistinct = false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					isDistinct = true;
					break;
				}
			}
			if(!isDistinct) res[i] = arr[i];
		}
		return res;
	}
	
	//function to find total no. of regular polygon from numbers in an array
	static void totalfig(int[] n) {
		int total = 0;
		for(int i=0;i<n.length;i++) {
			total = total+ fig(n[i]);
		}
		System.out.println(total);
	}
	
	//driver function
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		int newar[] = new int[size];
		for(int i = 0;i<size;i++) {
			int temp = arr[i];
			int count = 0;
			for(int j=0;j<size;j++) {
				if(arr[j] == temp) count++;
			}
			if(count == arr[i]) {
				newar[i] = count;
			}
		}

		int[] finalarray = distinct(newar);
		//for(int i:finalarray) System.out.println(i);
		totalfig(finalarray);
		
		scanner.close();
	}

}
