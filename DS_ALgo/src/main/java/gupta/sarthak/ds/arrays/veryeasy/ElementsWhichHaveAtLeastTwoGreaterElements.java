package gupta.sarthak.ds.arrays.veryeasy;
/*
* You are given an array of distinct integers A, you have to find and return all elements in array which have at-least two greater elements than themselves.
* NOTE: The result should have the order in which they are present in the original array.
* Problem Constraints
* 3 <= |A| <= 10^5
* -10^9 <= A[i] <= 10^9
* First and only argument is an integer array A.
*  A = [1, 2, 3, 4, 5]
* Return an integer array containing the elements of A which have at-least two greater elements than themselves in A.
*  [1, 2, 3]
* */
public class ElementsWhichHaveAtLeastTwoGreaterElements {

    public class Solution {
        public int[] solve(int[] A) {
            int max = Integer.MIN_VALUE;
            int secMax = Integer.MIN_VALUE;
            int[] a = new int[A.length - 2];
            for(int i = 0; i < A.length; i++){
                if(A[i] > secMax && A[i] < max){
                    secMax = A[i];
                }else if(A[i] > max){
                    secMax = max;
                    max = A[i];
                }
            }
            if(max == secMax || secMax == Integer.MIN_VALUE)
                return a;
            int k = 0;
            for(int i = 0; i < A.length; i++){
                if(A[i] < secMax){
                    a[k++] = A[i];
                }
            }
            return a;
        }
    }
}
