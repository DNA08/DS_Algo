package gupta.sarthak.ds.arrays.easy;

/*
* Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
* A = [3, 2, 1, 3]
* For integer 2, there are 2 greater elements in the array. So, return 1.
* */

import java.util.Arrays;

public class NobleInteger {

    public class Solution {
        public int solve(int[] A) {
            Arrays.sort(A);
            int i = 0;
            while(i < A.length){
                if( i == A.length - 1 || A[i] != A[i+1] ){
                    if(A[i] == A.length - i - 1){
                        return 1;
                    }
                }
                i++;
            }
            return -1;
        }
    }

}
