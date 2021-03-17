package gfgForkJava;
import java.util.Scanner;

public class StringPair {

	public static void main(String[] args) throws Exception {
		String[][] numbers = { 
				{"0","zero","2"},
				{"1","one","2"},
				{"2","two","1"},
				{"3","three","2"},
				{"4","four","2"},
				{"5","five","2"},
				{"6","six","1"},
				{"7","seven","2"},
				{"8","eight","2"},
				{"9","nine","2"}
				};
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		//applying constraint check 1
		try {
			int[] arr = new int[t];
			for(int i=0;i<t;i++) {
				arr[i] = sc.nextInt();
			}
			
			//checking number of digits in arr[i] and range of digits too
			int temp = 0;			
			int sum = 0;
			int var = 0;
			for(int i = 0;i<t;i++) {
				var = arr[i];
				//applying constraint check 2
				if(var>=1 && var<=100) {
					if(var==100) {
						String s = String.valueOf(2);		//stated in question for hundred
						for(int j=0;j<10;j++) {
							if(s.equals(numbers[j][0])) {
								int tempSum = Integer.parseInt(numbers[j][2]);
								sum = sum + tempSum;
								break;
							}
						}
					}
					while(var>0) {
						temp = var%10;
						String s = String.valueOf(temp);
						for(int j=0;j<10;j++) {
							if(s.equals(numbers[j][0])) {
								int tempSum = Integer.parseInt(numbers[j][2]);
								sum = sum + tempSum;
							}
						}
						var = var/10;
					}
				}
				else {
					throw new Exception();
				}
			}
			//System.out.println(sum);
			
			
			int count = 0;
			for(int i=0;i<t-1;i++) {
				if((arr[i]+arr[i+1]) == sum) {
					count++;
				}
			}
			//System.out.println(count);
			if(count > 100) System.out.print("greater 100");
			
			String res = "";
			for(int i=0;i<10;i++) {
				if(count == Integer.parseInt(numbers[i][0])) {
					res = numbers[i][1];
				}
			}
		
			System.out.print(res);
		}
		catch(IllegalArgumentException e) {
			System.out.print(e);
		}
		sc.close();
	}
}
