package gupta.sarthak.ds.arrays.easy;
/*
* You have given a string A having Uppercase English letters.
* You have to find that how many times subsequence "AG" is there in the given string.
*NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
*
* A = "ABCGAG"
* 3
* */

public class AGSubsequence {
    public class Solution {
        public int solve(String A) {
            int countA = 0;
            int res = 0;
            for(int i = 0; i < A.length(); i++){
                char c = A.charAt(i);
                if(c == 'A'){
                    countA++;
                }
                if(c == 'G'){
                    res += countA;
                }
            }
            return res;
        }
    }

}
