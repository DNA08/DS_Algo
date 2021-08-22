package gupta.sarthak.ds.tree.medium;

/*
* Given the root of a Binary Search Tree (BST), convert it to a Greater Tree such that every key of the original BST is changed to the original key plus sum of all keys greater than the original key in BST.
* Input: root = [4,1,6,0,2,5,7,null,null,null,3,null,null,null,8]
* Output: [30,36,21,36,35,26,15,null,null,null,33,null,null,null,8]
*
* The number of nodes in the tree is in the range [1, 100].
* 0 <= Node.val <= 100
* All the values in the tree are unique.
* root is guaranteed to be a valid binary search tree.
*
* */

public class BinarySearchTreetoGreaterSumTree {
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
        public static int sum = 0;
        public TreeNode bstToGst(TreeNode root) {
            sum = 0;
            return conversion(root);
        }
        public static TreeNode conversion(TreeNode root){
            if(root == null) return root;
            if(root.left == null && root.right == null){
                sum = sum + root.val;
                root.val = sum;
                return root;
            }
            conversion(root.right);
            sum = sum + root.val;
            // System.out.println(sum);
            root.val = sum;
            conversion(root.left);
            return root;
        }
    }
}
