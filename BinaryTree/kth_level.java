// import java.util.*;

// class TreeNode {
//     int val;
//     TreeNode left, right;

//     TreeNode(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class KthLevelOfTree {

//     // Function to print all nodes at kth level
//     static void printKthLevel(TreeNode root, int k) {
//         if (root == null) return;

//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.add(root);

//         int level = 0;

//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             level++;

//             // If current level is k → print all nodes at this level
//             if (level == k) {
//                 for (int i = 0; i < size; i++) {
//                     TreeNode node = queue.poll();
//                     System.out.print(node.val + " ");
//                 }
//                 return; // we can stop after kth level
//             }

//             // Push next level children
//             for (int i = 0; i < size; i++) {
//                 TreeNode node = queue.poll();
//                 if (node.left != null) queue.add(node.left);
//                 if (node.right != null) queue.add(node.right);
//             }
//         }
//     }

//     // Driver
//     public static void main(String[] args) {
//         /*
//                  1
//                /   \
//               2     3
//              / \   / \
//             4   5 6   7
//         */
//         TreeNode root = new TreeNode(1);
//         root.left = new TreeNode(2);
//         root.right = new TreeNode(3);
//         root.left.left = new TreeNode(4);
//         root.left.right = new TreeNode(5);
//         root.right.left = new TreeNode(6);
//         root.right.right = new TreeNode(7);

//         int k = 3;
//         System.out.print("Nodes at level " + k + ": ");
//         printKthLevel(root, k); // Output → 4 5 6 7
//     }
// }


import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class kth_level {

    // Recursive DFS approach
    static void kthlevel(TreeNode root, int level, int k){
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.val + " ");
            return;
        }

        kthlevel(root.left, level + 1, k);
        kthlevel(root.right, level + 1, k);
    }

    // Driver
    public static void main(String[] args) {
        /*
                 1
               /   \
              2     3
             / \   / \
            4   5 6   7
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        int k = 3;
        System.out.print("Nodes at level " + k + ": ");
        kthlevel(root, 1, k); // For k=2 → Output: 4 5 6 7
    }
}
