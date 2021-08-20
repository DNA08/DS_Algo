package gupta.sarthak.ds.tree.easy;

import java.util.ArrayList;
import java.util.List;


/*
* Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.
* Input: root = [4,2,6,1,3]
* Output: 1
* The number of nodes in the tree is in the range [2, 10^4].
* 0 <= Node.val <= 10^5
*
*
* */
public class MinimumAbsoluteDifferenceInBST {

//      Definition for a binary tree node.
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
        public int getMinimumDifference(TreeNode root) {
            List<Integer> arr = new ArrayList<>();
            arr = getSortedArray(root, arr);
            int diff = Integer.MAX_VALUE;
            for(int i = 0; i < arr.size() - 1; i++){
                if( (arr.get(i+1)- arr.get(i)) < diff ){
                    diff = arr.get(i + 1) - arr.get(i);
                }
            }
            return diff;
        }
        public static List<Integer> getSortedArray(TreeNode root, List<Integer> arr){
            if(root == null) return arr;
            getSortedArray(root.left,arr);
            arr.add(root.val);
            getSortedArray(root.right,arr);
            return arr;
        }
    }
}
