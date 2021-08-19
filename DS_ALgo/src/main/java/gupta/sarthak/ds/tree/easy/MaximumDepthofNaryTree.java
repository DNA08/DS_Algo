package gupta.sarthak.ds.tree.easy;

/*
*Given a n-ary tree, find its maximum depth.
*The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node
*Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).
* Input: root = [1,null,3,2,4,null,5,6]
* Output: 3
* Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
* Output: 5
* The total number of nodes is in the range [0, 10^4].
* The depth of the n-ary tree is less than or equal to 1000.
* */

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaximumDepthofNaryTree {

// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


    class Solution {
        public int maxDepth(Node root) {
            int level = 0;
            Queue<Node> q = new LinkedList<>();
            if(root != null){
                // level++;
                q.add(root);
            }
            while(q.size() > 0){
                int len = q.size();
                for(int i = 0; i < len; i++){
                    Node n = q.poll();
                    for(Node k : n.children){
                        q.add(k);
                    }
                }
                level++;
            }
            return level;
        }
    }
}
