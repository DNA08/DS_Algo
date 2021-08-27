package gupta.sarthak.ds.arrays.easy;

/*
* You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.
* 4 1 2 3 4
* 2
*  [1,2,3,4] => [4,1,2,3] => [3,4,1,2]
* */

import java.util.Scanner;

public class RotationGame {


    public static class Main {
        public static void main(String[] args) {
            // YOUR CODE GOES HERE
            // Please take input and print output to standard input/output (stdin/stdout)
            // DO NOT USE ARGUMENTS FOR INPUTS
            // E.g. 'Scanner' for input & 'System.out' for output
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t > 0){
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0; i < n; i++){
                    a[i] = sc.nextInt();
                }
                int b = sc.nextInt();
                b = b % n;
                a = reverse(a, 0, n - 1 );
                a = reverse(a, 0, b-1 );
                a = reverse(a, b, n - 1 );
                for(int i = 0; i < a.length; i++){
                    System.out.print(a[i]+" ");
                }
                System.out.println();
                t--;
            }
        }
        public static int[] reverse(int[] a, int s, int e){
            while(s < e){
                int temp = a[s];
                a[s] = a[e];
                a[e] = temp;
                s++;
                e--;
            }
            return a;
        }
    }
}
