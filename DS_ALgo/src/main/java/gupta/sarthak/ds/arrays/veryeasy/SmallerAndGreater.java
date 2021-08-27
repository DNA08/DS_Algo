package gupta.sarthak.ds.arrays.veryeasy;
/*
* You are given an Array A of size N.
*  Find for how many elements, there is a strictly smaller element and a strictly greater element.
* Input Format
* Given only argument A an Array of Integers.
* Return an Integer X, i.e number of elements
*
* 1 <= N <= 1e5
* 1 <= A[i] <= 1e6
* */
public class SmallerAndGreater {
    public class Solution {
        public int solve(int[] A) {
            if(A.length <= 2){
                return 0;
            }
            int n = A.length;
            int countMin = 0;
            int countMax = 0;

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < n; i++){
                if(A[i] > max){
                    countMax = 0;
                    max = A[i];
                }else if(A[i] == max){
                    countMax++;
                }
                if(A[i] < min){
                    countMin = 0;
                    min = A[i];
                }else if(A[i] == min){
                    countMin++;
                }
            }
            if(A.length - 2 - countMin - countMax  < 0)
                return 0;
            return A.length - 2 - countMin - countMax;
        }
    }

}
