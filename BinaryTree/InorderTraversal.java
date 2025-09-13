import java.util.*;

public class InorderTraversal {

    // Node class for Binary Tree
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    // Preorder Traversal (Recursive)
    public static void inorder(Node root) {
        if (root == null) {
            return;  // Base case
        }

        // Step 1: Traverse left subtree
        preorder(root.left);

        // Step 2: Visit root
        System.out.print(root.data + " ");

        // Step 3: Traverse right subtree
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
                  1
                 / \
                2   3
               / \   \
              4   5   6
        */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        System.out.print("Inorder Traversal: ");
        inorder(root); 
    }
}

