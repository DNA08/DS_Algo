package gupta.sarthak.ds.recursion.easy;

/*
* Write a recursive function that checks whether a string A is a palindrome or Not.
* Return 1 if the string A is palindrome, else return 0.

* Note: A palindrome is a string that's the same when reads forwards and backwards.
*
* 1 <= A <= 50000
* String A consist only of lowercase letters.
*
* Input Format
* First and only argument is a string A.
*
* Return 1 if the string A is palindrome, else return 0.
* */

public class CheckPalindrome {
    public class Solution {
        public int solve(String A) {
            int i = 0;
            int j = A.length() - 1;
            if(i >= j){
                return 1;
            }
            if(A.charAt(i) == A.charAt(j)){
                // System.out.println( A.substring(1 , A.length() - 1) );
                return solve(A.substring(1 , A.length() - 1) );
            }
            return 0;
        }
    }
}
