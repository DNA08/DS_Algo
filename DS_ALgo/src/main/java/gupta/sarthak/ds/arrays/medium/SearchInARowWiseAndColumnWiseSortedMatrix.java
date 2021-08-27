package gupta.sarthak.ds.arrays.medium;


/*
* Given a matrix of integers A of size N x M and an integer B.
*In the given matrix every row and column is sorted in increasing order. Find and return the position of B in the matrix in the given form:
*
If A[i][j] = B then return (i * 1009 + j)
* If B is not present return -1.
* */

public class SearchInARowWiseAndColumnWiseSortedMatrix {
    public class Solution {
        public int solve(int[][] A, int B) {
            int j = A[0].length - 1;
            int i = 0;
            int ans = Integer.MAX_VALUE;
            while( j >= 0 && i < A.length){
                if(A[i][j] == B){
                    ans = Math.min( ans, (i + 1) * 1009 + (j + 1));
                    j--;
                }else if(A[i][j] > B){
                    j--;
                }else{
                    i++;
                }
            }
            return ans != Integer.MAX_VALUE ? ans : -1;
        }
    }

}
