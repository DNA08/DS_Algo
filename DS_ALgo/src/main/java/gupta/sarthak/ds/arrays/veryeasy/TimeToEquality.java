package gupta.sarthak.ds.arrays.veryeasy;


/*
* Given an integer array A of size N. In one second you can increase the value of one element by 1.
* Find the minimum time in seconds to make all elements of the array equal.
* First argument is an integer array A.
*A = [2, 4, 1, 3, 2]
* 8
*We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
* */

public class TimeToEquality {
    public class Solution {
        public int solve(int[] A) {
            int op = 0;
            int max = A[0];
            for(int i = 0; i < A.length; i++){
                max = Math.max(max, A[i]);
            }
            for(int i = 0; i < A.length; i++){
                op += max - A[i];
            }
            return op;
        }
    }

}
