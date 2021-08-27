package gupta.sarthak.ds.arrays.veryeasy;

/*
* Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.
* If two rows have the maximum number of 1 then return the row which has a lower index.
* Rows are numbered from top to bottom and columns are numbered from left to right.
 *Assume 0-based indexing.
*Assume each row to be sorted by values.
*
* A = [   [0, 1, 1]
         [0, 0, 1]
         [0, 1, 1]   ]
 *0
*
* */

public class RowWithMaximumNumberOfOnes {
    public class Solution {
        public int solve(int[][] A) {
            int j = A[0].length - 1;
            int index = -1;
            int count = 0;
            int ans = 0;
            for(int i = 0; i < A.length; i++){
                while(j >= 0){
                    if(A[i][j] == 1){
                        j--;
                        count++;
                        if(count > ans){
                            ans = count;
                            index = i;
                        }
                    }else{
                        break;
                    }


                }
            }
            return index;
        }
    }

}
