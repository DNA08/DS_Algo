package gupta.sarthak.ds.tree.easy;

/*
* A binary tree is uni-valued if every node in the tree has the same value.
* Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
* Input: root = [1,1,1,1,1,null,1]
* Output: true
* Input: root = [2,2,2,5,2]
* Output: false
* */

public class UnivaluedBinaryTree {


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
        public boolean isUnivalTree(TreeNode root) {
            int data = root.val;

            return check(root, data);

        }
        public static boolean check(TreeNode root, int data){
            if(root == null) return true;
            if(root.val != data){
                return false;
            }
            return check(root.left, data) && check(root.right,data);
        }

    }
}
