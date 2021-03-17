package DSACodingContest;
import java.util.Scanner;

public class TestClass1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int num = scanner.nextInt();
		int[] arr = new int[size];
		for(int i= 0; i<size;i++)
		{
			arr[i] = scanner.nextInt();
		}
		int q = scanner.nextInt();
		for(int i = 0;i<q;i++)
		{
			System.out.println("chk:"+i);
			int type = scanner.nextInt();
			int occ = 0;
			int jindex = 0;
			if(type == 1) {
				System.out.println("In");
				int l = scanner.nextInt();
				int r = scanner.nextInt();
				int k = scanner.nextInt();
				for(int j = l-1; j<r;j++) {
					if(arr[j] == num) {
						occ++;
						jindex = j;
						break;
					}
				}
				if(occ == k) System.out.println(jindex+1);
				else System.out.println(-1);
			}
			else {
				System.out.println("here");
				int index = scanner.nextInt();
				int value = scanner.nextInt();
				arr[index-1] = value;
			}
		}
		scanner.close();
	}
}

/*7 1
2 1 3 1 1 4 5
5
1 1 2 1
1 2 3 1
1 4 5 1
2 2 2
1 1 2 3
*/
/* 2
 * 2
 * 2
 * -1
 */