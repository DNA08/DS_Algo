package gupta.sarthak.ds.arrays.easy;


/*
* Write a program to input an integer N from user and print pascal triangle up to N rows.
* 1 0 0 0 0
1 1 0 0 0
1 2 1 0 0
1 3 3 1 0
1 4 6 4 1
* */

public class PascalTriangle {
    public class Solution {
        public int[][] solve(int a) {
            int[][] A = new int[a][a];

            for(int i = 0; i < A.length; i++){
                for( int j = 0; j <= i; j++){
                    if(i == j || j == 0){
                        A[i][j] = 1;
                    }else{
                        A[i][j] = A[i - 1][j - 1] + A[i - 1][j];
                    }

                }
                for(int j = i + 1; j < A[i].length; j++){
                    A[i][j] = 0;
                }
            }
            return A;
        }
    }

}
