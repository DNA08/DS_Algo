package gupta.sarthak.ds.arrays.easy;


/*
* Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.
* Return a 2-D matrix which consists of the elements in spiral order.
*1 --> 2
      |
      |
4<--- 3
*
*
* */

public class SpiralOrderMatrix {

    public class Solution {
        public int[][] generateMatrix(int A) {
            int a[][] = new int[A][A];
            int count = 1;
            int sR = 0;
            int sC = 0;
            int eR = A - 1;
            int eC = A - 1;
            while(count <= A * A){
                for(int i = sC; i <= eC; i++ ){
                    a[sR][i] = count;
                    count++;
                }
                sR++;
                for(int i = sR; i <= eR; i++){
                    a[i][eC] = count;
                    count++;
                }
                eC--;
                if(eC > sC){
                    for(int i = eC; i >= sC; i--){
                        a[eR][i] = count;
                        count++;
                    }
                    eR--;
                }
                if(eR > sR){
                    for(int i = eR; i >= sR ; i--){
                        a[i][sC] = count;
                        count++;
                    }
                    sC++;
                }
            }
            return a;
        }
    }

}
