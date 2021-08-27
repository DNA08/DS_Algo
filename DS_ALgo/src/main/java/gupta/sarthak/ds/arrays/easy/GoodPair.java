package gupta.sarthak.ds.arrays.easy;

/*
* Given an array A and a integer B. A pair(i,j) in the array is a good pair if i!=j and (A[i]+A[j]==B). Check if any good pair exist or not.
* 1 <= A.size() <= 104
* 1 <= A[i] <= 10^9
* 1 <= B <= 109
* First argument is an integer array A.
* Second argument is an integer B.
* A = [1,2,3,4]
* B = 7
* 1
* */

import java.util.HashMap;

public class GoodPair {
    public class Solution {
        public int solve(int[] A, int B) {
            HashMap<Integer, Boolean> map = new HashMap<>();
            for(int i = 0; i < A.length; i++){
                if(map.containsKey(A[i])){
                    return 1;
                }else{
                    map.put(B - A[i], true);
                }
            }
            return 0;
        }
    }

}
