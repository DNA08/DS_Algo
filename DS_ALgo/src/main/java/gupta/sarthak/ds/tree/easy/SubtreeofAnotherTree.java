package gupta.sarthak.ds.tree.easy;

/*
* Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.
* A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.
*Input: root = [3,4,5,1,2], subRoot = [4,1,2]
* Output: true
*The number of nodes in the root tree is in the range [1, 2000].
*The number of nodes in the subRoot tree is in the range [1, 1000].
*-10^4 <= root.val <= 10^4
*-10^4 <= subRoot.val <= 10^4
*
* */

public class SubtreeofAnotherTree {
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
        public boolean isSubtree(TreeNode root, TreeNode subRoot) {
            return isNodePresent(root,subRoot);
        }
        public static boolean isNodePresent(TreeNode root, TreeNode root1){
            if(root == null) return false;
            if(root.val == root1.val){
                if(isSimilar(root, root1)){
                    return true;
                }
            }
            return isNodePresent(root.left,root1) ||  isNodePresent(root.right,root1);
        }
        public static boolean isSimilar(TreeNode root, TreeNode root1){
            if(root == null && root1 == null) return true;
            if(root == null) return false;
            if(root1 == null) return false;
            if(root.val != root1.val) return false;
            return isSimilar(root.left,root1.left) && isSimilar(root.right, root1.right);
        }
    }
}
