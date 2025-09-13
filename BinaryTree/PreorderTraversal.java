// import java.util.*;

// public class PreorderTraversal {

//     // Node class for Binary Tree
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     // Preorder Traversal (Recursive)
//     public static void preorder(Node root) {
//         if (root == null) {
//             return;  // Base case
//         }

//         // Step 1: Visit root
//         System.out.print(root.data + " ");

//         // Step 2: Traverse left subtree
//         preorder(root.left);

//         // Step 3: Traverse right subtree
//         preorder(root.right);
//     }

//     public static void main(String[] args) {
//         /*
//                   1
//                  / \
//                 2   3
//                / \   \
//               4   5   6
//         */
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.right = new Node(6);

//         System.out.print("Preorder Traversal: ");
//         preorder(root);  // Expected output: 1 2 4 5 3 6
//     }
// }



public class BuildTree_PreOrder{
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left= null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        } 

        public static void preorder(Node root){   // O(n)  time complexity
            if(root == null){
                return;
            }
            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.preorder(root);
    }
}