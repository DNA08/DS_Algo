package gupta.sarthak.ds.tree.medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;


/*
* Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).
* Input: root = [3,9,20,null,null,15,7]
* Output: [[3],[20,9],[15,7]]
*   The number of nodes in the tree is in the range [0, 2000].
* -100 <= Node.val <= 100

* */

public class BinaryTreeZigzagLevelOrderTraversal {

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
    class Solution {
        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            Deque<TreeNode> q = new LinkedList<>();
            List<List<Integer>>ans = new ArrayList<>();
            if(root == null) return ans;
            q.add(root);
            int level = 1;
            List<Integer> a = new ArrayList<>();
            a.add(root.val);
            ans.add(a);
            while(q.size() > 0){
                a = new ArrayList<>();
                int n = q.size();
                for(int i = 0; i < n; i++){
                    TreeNode t = new TreeNode();
                    if(level % 2 == 1){
                        t = q.removeFirst();
                        if(t.right != null){
                            q.addLast(t.right);
                            a.add(t.right.val);
                        }
                        if(t.left != null){
                            q.addLast(t.left);
                            a.add(t.left.val);
                        }
                    }else{
                        t = q.removeLast();
                        if(t.left != null){
                            q.addFirst(t.left);
                            a.add(t.left.val);
                        }
                        if(t.right != null){
                            q.addFirst(t.right);
                            a.add(t.right.val);
                        }
                    }
                }
                level++;
                if(a.size() != 0){
                    ans.add(a);
                }
            }
            return ans;
        }
    }
}
