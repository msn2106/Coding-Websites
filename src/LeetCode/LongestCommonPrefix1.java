
/*
Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */
package LeetCode;

import java.util.Scanner;

public class LongestCommonPrefix1 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String[] strarr = {"flower","flow","flight"};
        //String[] strarr = {"dog","racecar","car"};
        String lcp = longestCommonPrefix(strarr);
        System.out.println(lcp);
    }

    //function to return longest common prefix string in the passed string array.
    public static String longestCommonPrefix(String[] strs) {
        //best code
        if(strs == null || strs.length == 0)    return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                pre = pre.substring(0, pre.length()-1);
            }
        }
        return pre;
    }
}

/*
Constraints:
   1) 0 <= strs.length <= 200
   2) 0 <= strs[i].length <= 200
   3) strs[i] consists of only lower-case English letters.
 */