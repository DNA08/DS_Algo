package gupta.sarthak.ds.stacksandqueues;


/*
*Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1,
*  compute how much water it is able to trap after raining.
* 1 <= |A| <= 100000
*First and only argument is the vector A
*Return one integer, the answer to the question
* */
public class RainWaterTrapped {
    public class Solution {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        public int trap(final int[] A) {
            int n = A.length;
            int[] lm = new int[n];
            int[] rm = new int[n];
            int i = 0;
            int j = n - 1;
            int rM = Integer.MIN_VALUE;
            int lM = Integer.MIN_VALUE;
            while(i < n){
                if(A[i] > lM){
                    lm[i] = A[i];
                    lM = A[i];
                }else{
                    lm[i] = lM;
                }
                if(A[j] > rM){
                    rm[j] = A[j];
                    rM = A[j];
                }else{
                    rm[j] = rM;
                }
                i++;
                j--;
            }
            int total = 0;
            for(int k = 0; k < n; k++){
                if(lm[k] > A[k] && rm[k] > A[k]){
                    total = total + Math.min(lm[k],rm[k]) - A[k];
                }
            }
            return total;
        }
    }
}
