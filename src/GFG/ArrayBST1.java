package dsProblems;

//JAVA Code for Sorted order printing of a 
//given array that represents a BST 
public class ArrayBST1{ 
	
public static void inorder(int[] arr, int start, int end) {
	if(start > end) return;
	inorder(arr, (start*2)+1, end);
	System.out.print(arr[start]+" ");
	inorder(arr, (start*2)+2, end);
}
		
	// driver program to test above function 
	public static void main(String[] args) { 
		int arr[] = {4, 2, 5, 1, 3}; 
			
		inorder(arr, 0, arr.length-1); 
	} 
} 
	
//some problem - feedback submitted on gfg 
