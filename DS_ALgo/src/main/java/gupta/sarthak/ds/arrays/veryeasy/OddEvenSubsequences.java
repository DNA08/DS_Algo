package gupta.sarthak.ds.arrays.veryeasy;

/*
* Given an array of integers A of size N. Find the longest subsequence of A which is odd-even.
* The first element of the subsequence is odd, second element is even, third element is odd and so on. For example: [5, 10, 5, 2, 1, 4], [1, 2, 3, 4, 5]
* The first element of the subsequence is even, second element is odd, third element is even and so on. For example: [10, 5, 2, 1, 4, 7], [10, 1, 2, 3, 4]
* Input 1:
    A = [1, 2, 2, 5, 6]
Output 1:
*    4
*    Explanation 1:
* Maximum length odd even subsequence is [1, 2, 5, 6]
* */

public class OddEvenSubsequences {
    public class Solution {
        public int solve(int[] A) {
            boolean isOdd;
            if(A[0] % 2 == 0){
                isOdd = false;
            }else{
                isOdd = true;
            }
            int count = 1;
            isOdd = !isOdd;
            for(int i = 1; i < A.length; i++){
                if((A[i] % 2 == 0) != isOdd){
                    count++;
                    isOdd = !isOdd;
                }
            }
            return count;
        }
    }

}
