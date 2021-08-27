package gupta.sarthak.ds.arrays.easy;

/*
* Given an array of integers A, update every element with multiplication of previous and next elements with following exceptions. a) First element is replaced by multiplication of first and second. b) Last element is replaced by multiplication of last and second last.
*Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [2, 3, 8, 15, 20]
*
*
*
* */

public class MultiplicationOfPreviousAndNext {
    public class Solution {
        public int[] solve(int[] A) {
            if(A.length == 0) return A;
            int prev = A[0];
            int next = 1;
            for(int i = 0; i < A.length - 1 ; i++){
                int prevTemp = A[i];
                A[i] = A[i + 1] * prev;
                prev = prevTemp;
            }
            A[A.length - 1] = prev * A[A.length -  1];
            return A;
        }
    }

}
