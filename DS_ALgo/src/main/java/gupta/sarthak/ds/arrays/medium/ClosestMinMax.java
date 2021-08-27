package gupta.sarthak.ds.arrays.medium;
/*
* Given an array A. Find the size of the smallest subarray such that it contains atleast one occurrence of the maximum value of the array
*and atleast one occurrence of the minimum value of the array.
*A = [1, 3]  => 2
*A = [2] => 1
* */
public class ClosestMinMax {
    public class Solution {
        public int solve(int[] A) {
            if(A.length == 1) return 1;
            int minI = -1;
            int maxI = -1;
            int ans = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < A.length; i++){
                if(A[i] > max){
                    max = A[i];
                }
                if(A[i] < min){
                    min = A[i];
                }
            }
            for(int i = 0; i < A.length; i++){
                if(A[i] == max){
                    maxI = i;
                }
                if(A[i] == min){
                    minI = i;
                }
                if(minI != -1 && maxI != -1){
                    ans = Math.min(ans, Math.abs(minI - maxI ) + 1);
                }
            }
            return ans;
        }
    }

}
