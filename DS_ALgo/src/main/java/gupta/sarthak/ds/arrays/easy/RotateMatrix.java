package gupta.sarthak.ds.arrays.easy;

/*
* You are given a n x n 2D matrix A representing an image.
* Rotate the image by 90 degrees (clockwise).
* [
    [1, 2],
    [3, 4]
 ]
*
*  [
    [3, 1],
    [4, 2]
 ]
* */

public class RotateMatrix {

    public class Solution {
        public void solve(int[][] A) {
            for(int i = 0; i < A.length ; i++){
                for(int j = 0; j < i ; j++){
                    int temp = A[i][j];
                    A[i][j] = A[j][i];
                    A[j][i] = temp;
                }
            }
            for(int i = 0; i < A.length; i++){
                int s = 0;
                int e = A[i].length - 1;
                while( s < e){
                    int temp = A[i][s];
                    A[i][s] = A[i][e];
                    A[i][e] = temp;
                    s++;
                    e--;
                }
            }
        }
    }

}
