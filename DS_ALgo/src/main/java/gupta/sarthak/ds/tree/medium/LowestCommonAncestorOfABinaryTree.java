package gupta.sarthak.ds.tree.medium;


/*
* Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
*
* According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a
* Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
* Output: 3
*
* The number of nodes in the tree is in the range [2, 105].
* -109 <= Node.val <= 109
* All Node.val are unique.
* p != q
* p and q will exist in the tree.
* */

public class LowestCommonAncestorOfABinaryTree {

//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null) return root;
            if(root.val == p.val || root.val == q.val){
                return root;
            }

            TreeNode left = lowestCommonAncestor(root.left, p, q);
            TreeNode right = lowestCommonAncestor(root.right, p, q);
            if(left != null && right != null){
                return root;
            }
            if(left == null) return right;
            return left;
        }
    }
}
