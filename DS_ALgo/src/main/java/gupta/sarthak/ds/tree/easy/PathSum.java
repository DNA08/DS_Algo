package gupta.sarthak.ds.tree.easy;

/*
* Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
* Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
* Output: true
* Input: root = [1,2,3], targetSum = 5
* Output: false
*
* The number of nodes in the tree is in the range [0, 5000].
* -1000 <= Node.val <= 1000
* -1000 <= targetSum <= 1000
*
* */

public class PathSum {
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
        public boolean hasPathSum(TreeNode root, int targetSum) {
            return hasPath(root,targetSum,0);
        }
        public static boolean hasPath(TreeNode root , int target, int sum){
            if(root == null) return false;
            if(root.left == null && root.right == null){
                sum += root.val;
                return sum == target;
            }
            sum = sum + root.val;
            return hasPath(root.left,target,sum) || hasPath(root.right,target,sum);
        }
    }
}
