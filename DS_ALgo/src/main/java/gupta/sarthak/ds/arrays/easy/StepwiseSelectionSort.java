package gupta.sarthak.ds.arrays.easy;

/*
* Given an integer array A of size N.
*You need to sort the elements in increasing order using SelectionSort. Return a array containing the min value's index position before every iteration.
* A = [6, 4, 3, 7, 2, 8]
*  [4, 2, 2, 4, 4]
* Explanation : 6 4 3 7 2 8 : Index of 1st min - 4
 After 1st Iteration : 2 4 3 7 6 8 : Index of 2nd min - 2
 After 2nd Iteration : 2 3 4 7 6 8 : Index of 3rd min - 2
 After 3rd Iteration : 2 3 4 7 6 8 : Index of 4th min - 4
 After 4th iteration : 2 3 4 6 7 8 : Index of 5th min - 4
 After 5th iteration. : 2 3 4 6 7 8.
*
* */

public class StepwiseSelectionSort {

    public class Solution {
        public int[] solve(int[] A) {
            int[] index = new int[A.length - 1];
            for(int i = 0; i < A.length-1; i++){
                index[i] = findMinIndex(A,i);
                int temp = A[i];
                A[i] = A[index[i]];
                A[index[i]] = temp;
            }
            return index;
        }
        public  int findMinIndex(int[] a, int start){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int i = start; i < a.length; i++){
                if(a[i] < min){
                    min = a[i];
                    index = i;
                }
            }
            return index;
        }
    }

}
