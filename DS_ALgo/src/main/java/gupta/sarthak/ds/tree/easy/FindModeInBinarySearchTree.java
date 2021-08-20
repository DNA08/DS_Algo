package gupta.sarthak.ds.tree.easy;

import java.util.*;

/*
* Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) in it.
* If the tree has more than one mode, return them in any order.
*
* Input: root = [1,0,3]
* Output: [1,0,3]
*
* The number of nodes in the tree is in the range [1, 104].
* -10^5 <= Node.val <= 10^5
* */

public class FindModeInBinarySearchTree {

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
        public int[] findMode(TreeNode root) {
            int max = Integer.MIN_VALUE;
            Queue<TreeNode> q = new LinkedList<>();
            HashMap<Integer,Integer> cmap = new HashMap<>();
            q.add(root);
            while(q.size() > 0){
                int n = q.size();
                for(int i = 0; i < n; i++){
                    TreeNode t = q.poll();
                    if(cmap.containsKey(t.val)){
                        cmap.put(t.val, cmap.get(t.val) + 1);
                    }else{
                        cmap.put(t.val,1);
                    }
                    if(cmap.get(t.val) > max){
                        max = cmap.get(t.val);
                    }
                    if(t.left != null){
                        q.add(t.left);
                    }
                    if(t.right != null){
                        q.add(t.right);
                    }
                }
            }
            List<Integer> a = new ArrayList<>();
            for(int i : cmap.keySet()){
                if(cmap.get(i) == max){
                    a.add(i);
                }
            }
            int[] ans = new int[a.size()];
            for(int i = 0; i < a.size(); i++){
                ans[i] = a.get(i);
            }
            return  ans;
        }
    }
}
