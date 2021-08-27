package gupta.sarthak.ds.arrays.medium;

/*
* Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.
* Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
*
*
* */

public class LengthOfLongestConsecutivesOnes {
    public class Solution {
        public int solve(String A) {
            int[] lc = new int[A.length()];
            int[] rc = new int[A.length()];
            int sum = 0;
            for(int i = 0; i < lc.length; i++){
                int j = Character.getNumericValue(A.charAt(i));
                if(i == 0){
                    lc[i] = j;
                }else{
                    if(j == 0){
                        lc[i] = 0;
                    }else{
                        lc[i] = lc[i - 1] + 1;
                    }
                }
                sum += j;
            }
            for(int i = rc.length - 1; i >= 0; i--){
                int j = Character.getNumericValue(A.charAt(i));
                if(i == rc.length - 1){
                    rc[i] = j;
                }else{
                    if(j == 0){
                        rc[i] = 0;
                    }else{
                        rc[i] = rc[i + 1] + 1;
                    }
                }
            }
            int oC = 0,ans = Integer.MIN_VALUE;
            for(int i = 0; i < lc.length; i++){
                int k = Character.getNumericValue(A.charAt(i));
                if(k == 1){
                    oC = lc[i] + rc[i] - 1;
                }else{
                    if(i == 0){
                        oC = rc[i + 1] + 1;
                    }else if( i == lc.length - 1){
                        oC = lc[i - 1] + 1;
                    }else{
                        oC = lc[i - 1] + rc[i + 1] + 1;
                    }
                    if(oC > sum){
                        oC--;
                    }
                }
                ans = Math.max(ans, oC);


            }
            return ans;
        }
    }

}
