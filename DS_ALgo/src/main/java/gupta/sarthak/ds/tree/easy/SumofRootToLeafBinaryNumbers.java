package gupta.sarthak.ds.tree.easy;

import java.util.ArrayList;
import java.util.List;

/*
*You are given the root of a binary tree where each node has a value 0 or 1.  Each root-to-leaf path represents a
*binary number starting with the most significant bit.  For example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this
*could represent 01101 in binary, which is 13.
* For all leaves in the tree, consider the numbers represented by the path from the root to that leaf.
* Return the sum of these numbers. The answer is guaranteed to fit in a 32-bits integer.
*
* Input: root = [1,0,1,0,1,0,1]
* Output: 22
* Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
* */

public class SumofRootToLeafBinaryNumbers {

    //  Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    static class Solution {
        public static List<String> a = new ArrayList<>();
        public int sumRootToLeaf(TreeNode root) {
            a = new ArrayList<>();
            getSingleString(root,"");
            int sum = 0;
            for(String s : a){
                sum  = sum + getBin(s);
            }
            return sum;
        }
        public static int getBin(String s){
            int n = 0;
            int i = s.length() - 1;
            int count = 0;
            while(i >= 0 ){
                int num = (int)Math.pow(2,count) * Character.getNumericValue(s.charAt(i));
                n = n + num;
                count++;
                i--;
            }
            return n;
        }
        public static void getSingleString(TreeNode root, String s){
            if(root == null){
                return;
            }
            s = s + root.val;
            if(root.left == null && root.right == null){
                a.add(s);
                return;
            }
            getSingleString(root.left, s);
            getSingleString(root.right, s);
        }
    }
}
