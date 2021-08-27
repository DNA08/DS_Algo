package gupta.sarthak.ds.arrays.easy;

/*
* Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.

 *Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
The vacant spaces in the grid should be assigned to 0.
* Input
* 3
1 2 3
4 5 6
7 8 9
*
* Output
* 1 0 0
2 4 0
3 5 7
6 8 0
9 0 0
*
*
* */

public class AntiDiagonals {
    public class Solution {
        public int[][] diagonal(int[][] A) {
            int [][] a = new int[2*A.length - 1][A[0].length];
            int c = 0;
            for( int j = 0; j < A[0].length; j++){
                int i = 0;
                int k = j;
                while(i <= j && k >= 0 ){
                    a[c][i] = A[i][k];
                    i = i + 1;
                    k = k - 1;
                }
                c++;
            }
            for(int i = 1; i < A.length; i++){
                int j = A[i].length - 1;
                int k = i;
                int d = 0;
                while(j >= 0 && k < A.length){
                    a[c][d] = A[k][j];
                    d++;
                    k++;
                    j--;
                }
                c++;
            }
            return a;
        }
    }

}
