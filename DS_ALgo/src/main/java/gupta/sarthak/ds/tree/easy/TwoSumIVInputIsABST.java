package gupta.sarthak.ds.tree.easy;

import java.util.HashSet;
/*
*Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.
* Input: root = [5,3,6,2,4,null,7], k = 9
* Output: true
*
* The number of nodes in the tree is in the range [1, 104].
* -10^4 <= Node.val <= 10^4
* root is guaranteed to be a valid binary search tree.
*  -10^5 <= k <= 10^5
*
* */

public class TwoSumIVInputIsABST {

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
        public boolean findTarget(TreeNode root, int k) {
            HashSet<Integer> map = new HashSet<>();
            return checkSum(root,k,map);
        }
        public static boolean checkSum(TreeNode root, int k, HashSet<Integer>map){
            if(root == null) return false;
            if(map.contains(k - root.val) ) return true;
            map.add(root.val);
            return checkSum(root.left, k, map)  || checkSum(root.right, k, map);

        }
    }
}
