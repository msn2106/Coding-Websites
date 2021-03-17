package AugustLongChallenge;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class SKMPAug20B
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextInt();
		while(t-- >0){
		    String text = sc.nextLine();
		    String pattern = sc.nextLine();
		    
		    //storing all permutation of text string in ArrayList
		    ArrayList<String> pre = new ArrayList<String>();
		    pertext(text,"",pre);
		    
		    //converting ArrayList to String array
		    Object[] obj = pre.toArray();
		    String[] s2 = Arrays.copyOf(obj, obj.length, String[].class);
		    
		    //lexicographically sorted array
		    String[] lexta = lexSorted(s2);

            //searching pattern in lexicographically sorted array
		    String res = searchLexSmall(lexta,pattern);
		    System.out.println(res);
		}
		sc.close();
	}
	
	//function to obtain all the permutation of text string and store in an array
	public static ArrayList<String> pertext(String s, String ans,ArrayList<String> per){
	    if (s.length() == 0) { 
            per.add(ans);
        } 
        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i); 
            String ros = s.substring(0, i) + s.substring(i + 1); 
            pertext(ros, ans + ch,per); 
        }
	    return per;
	}
	
	//function to lexicographically sort the permutated String array
	public static String[] lexSorted(String[] s){
	    int tal = s.length;
	    for(int i=0;i<tal-1;i++) {
			int flag = 0;
			for(int j=0;j<tal-1-i;j++) {
				if(s[j].compareTo(s[j+1]) > 0) {
					
					String temp = s[j];
					s[j] = s[j+1];
					s[j+1] = temp;
					flag = 1;
				}
			}
			if(flag == 0) break;			
	    }
	    return s;
	}
	
	//function to search pattern in lexicographically sorted array lexta
	public static String searchLexSmall(String[] lexta, String pattern){
	    String res = " ";
	    
	    
	    
	    return res;
	}
}
