package gupta.sarthak.ds.arrays.easy;

/*
* You are given an array of integers A of size N.
* Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
* 2 <= N <= 1e5
* -1e9 <= A[i] <= 1e9
* There is atleast 1 odd and 1 even number in A
* A = [0, 2, 9]
* -7
 * */

public class MinimumPicks {

    public class Solution {
        public int solve(int[] A) {
            int maxEven = Integer.MIN_VALUE;
            int minOdd = Integer.MAX_VALUE;
            for(int i = 0; i < A.length; i++){
                if(A[i] % 2 == 0 && maxEven < A[i]){
                    maxEven = A[i];
                }else if(minOdd > A[i] && A[i] % 2 != 0){
                    minOdd = A[i];
                }
            }
            return maxEven - minOdd;
        }
    }

}
