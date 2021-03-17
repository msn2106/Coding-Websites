/** Java implementation to print all divisors
 * 
 */
package gfgForkJava;

/**
 * @author msn2106
 *
 */
//1.Naive Approach - {time - O(n)} - {space - O(n)}
//public class FindAllDivisors
//{ 
// // method to print the divisors 
// static void printDivisors(int n) 
// { 
//     for (int i=1;i<=n;i++) 
//         if (n%i==0) 
//             System.out.printf("%d ",i); 
// } 
//
// // Driver method 
// public static void main(String args[]) 
// { 
//     System.out.println("The divisors of 100 are: "); 
//     printDivisors(100);; 
// } 
//} 


//2.A Better (than Naive) Solution to find all divisors - {time - 0(sqrt(n))} - {space - O(n)}
//The issue here is that output is not in sorted order
public class FindAllDivisors 
{ 
 // method to print the divisors 
 static void printDivisors(int n) 
 { 
     // Note that this loop runs till square root 
     for (int i=1; i<=Math.sqrt(n); i++) 
     { 
         if (n%i==0) 
         { 
             // If divisors are equal, print only one 
             if (n/i == i) 
                 System.out.printf("%d ", i); 
    
             else // Otherwise print both 
                 System.out.printf("%d %d ", i, n/i); 
         } 
     } 
 } 

 // Driver method 
 public static void main(String args[]) 
 { 
     System.out.println("The divisors of 100 are: "); 
     printDivisors(100);; 
 } 
} 


//3.A O(sqrt(n)) java program that prints all divisors in sorted order - {time - O(sqrt(n))} - {space O(sqrt(n))}

//import java.util.Vector; 
//
//public class FindAllDivisors 
//{ 
// // method to print the divisors 
// static void printDivisors(int n) 
// { 
//     // Vector to store half of the divisors 
//     Vector<Integer> v = new Vector<>(); 
//     for (int i=1; i<=Math.sqrt(n); i++) 
//     { 
//         if (n%i==0) 
//         { 
//             if (n/i == i) // check if divisors are equal 
//                 System.out.print(i+" "); 
//             else
//             { 
//                  System.out.print(i+" "); 
//    
//                 // push the second divisor in the vector 
//                 v.add(n/i); 
//             } 
//         } 
//     } 
//    
//     // The vector will be printed in reverse 
//     for (int i=v.size()-1; i>=0; i--) 
//          System.out.print(v.get(i)+" "); 
//     
// } 
//
// // Driver method 
// public static void main(String args[]) 
// { 
//     System.out.println("The divisors of 100 are: "); 
//     printDivisors(100); 
// } 
//} 

