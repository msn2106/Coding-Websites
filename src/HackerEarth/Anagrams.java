package basicIO;

//import for Scanner and other utility classes
import java.util.*;
class Anagrams {
  public static void main(String args[] ) throws Exception {

      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      sc.nextLine();
      while(t-- >0){
          String s1 = sc.nextLine();
          String s2 = sc.nextLine();            
          int ls1 = s1.length();
          int ls2 = s2.length();

          //to count frequency of each alphabet
          int[] fs = new int[26];

          for(int i=0;i<ls1;i++){
              fs[s1.charAt(i)-97]++;
          }

          for(int i=0;i<ls2;i++){
              fs[s2.charAt(i)-97]--;
          }

          //measuring the difference
          int diff = 0;
          for(int i=0;i<26;i++){
              diff = diff + Math.abs(fs[i]);
          }
          System.out.println(diff);
      }
      sc.close();
  }
}
