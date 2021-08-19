package gupta.sarthak.ds.recursion.easy;

/*
* Given a number A, we need to find sum of its digits using recursion.
* 1 <= A <= 109
* I/P First and only argument is an integer A.
* O/P Return an integer denoting the sum of digits of the number A.

*/

public class SumofDigits {
    public class Solution {
        public int solve(int A) {
            if(A / 10 == 0){
                return A;
            }
            return (A%10) + solve(A/10);
        }
    }
}
