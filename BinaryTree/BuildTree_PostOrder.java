// import java.util.*;

// public class InorderTraversal {

//     // Node class for Binary Tree
//     static class Node {
//         int data;
//         Node left, right;

//         Node(int data) {
//             this.data = data;
//             left = right = null;
//         }
//     }

//     // Postorder Traversal (Recursive)
//     public static void postorder(Node root) {
//         if (root == null) {
//             return;  // Base case
//         }

//         // Step 1: Traverse left subtree
//         postorder(root.left);

//         // Step 2: Traverse right subtree
//         postorder(root.right);

//         // Step 3: Visit root
//         System.out.print(root.data + " ");
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

//         System.out.print("Postorder Traversal: ");
//         postorder(root); 
//     }
// }


public class BuildTree_PostOrder{
    
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

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data +" ");
        }
    } 

    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        tree.postorder(root);
    }
}

