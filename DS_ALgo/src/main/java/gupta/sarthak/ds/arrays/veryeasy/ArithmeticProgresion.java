package gupta.sarthak.ds.arrays.veryeasy;

/*
* Given an integer array A of size N. Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0.
* Return 1 if the array can be rearranged to form an arithmetic progression, otherwise, return 0
* A = [3, 5, 1]
* 1
* */

import java.util.HashSet;

public class ArithmeticProgresion {

    public class Solution {
        public int solve(int[] A) {
            HashSet<Integer> set = new HashSet<>();
            int min = Integer.MAX_VALUE;
            int secMin = Integer.MAX_VALUE;
            for(int i = 0; i < A.length; i++){
                set.add(A[i]);
                if(A[i] < min){
                    secMin = min;
                    min = A[i];
                }
                if(A[i] < secMin && A[i] > min){
                    secMin = A[i];
                }
            }
            int d = secMin - min;
            for(int i = 0; i < A.length; i++){
                if(!set.contains(min + i * d)){
                    return 0;
                }
            }
            return 1;
        }
    }

}
