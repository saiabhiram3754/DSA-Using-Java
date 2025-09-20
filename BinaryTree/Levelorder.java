import java.util.*;  // Import utility package for Queue and LinkedList

public class Levelorder {

    // Node class represents each element of the binary tree
    static class Node {
        int data;     // value of the node
        Node left;    // reference to the left child
        Node right;   // reference to the right child

        // Constructor to initialize a new node with given data
        Node(int data) {
            this.data = data;
            this.left = null;   // left child is initially null
            this.right = null;  // right child is initially null
        }
    }

    // BinaryTree class contains methods to build and traverse the tree
    static class BinaryTree {
        static int idx = -1;  // static index to track current position in input array

        // Method to build tree recursively from given preorder array
        public static Node buildTree(int nodes[]) {
            idx++;  // move to next index

            // -1 means no node (null), so return null
            if (nodes[idx] == -1) {
                return null;
            }

            // create a new node with current data
            Node newnode = new Node(nodes[idx]);

            // recursively build the left subtree
            newnode.left = buildTree(nodes);

            // recursively build the right subtree
            newnode.right = buildTree(nodes);

            return newnode; // return the constructed node
        }

        // Method to perform Level Order Traversal (BFS)
        public static void levelorder(Node root) {
            // if tree is empty, return
            if (root == null) {
                return;
            }

            // Create a queue to store nodes during traversal
            Queue<Node> q = new LinkedList<>();

            // add root node to queue
            q.add(root);

            // add null marker to indicate end of current level
            q.add(null);

            // loop until queue is empty
            while (!q.isEmpty()) {
                // remove front element from queue
                Node currentNode = q.remove();

                // if we encounter null → one level is finished
                if (currentNode == null) {
                    System.out.println(); // move to next line
                    // if queue is empty, traversal is done
                    if (q.isEmpty()) {
                        break;
                    } else {
                        // add another null marker for next level
                        q.add(null);
                    }
                } else {
                    // print current node’s data
                    System.out.print(currentNode.data + " ");

                    // add left child to queue if exists
                    if (currentNode.left != null) {
                        q.add(currentNode.left);
                    }

                    // add right child to queue if exists
                    if (currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }
    }

    // main method: entry point of program
    public static void main(String[] args) {
        // input array representing a binary tree in preorder
        // -1 indicates a null child
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        // create BinaryTree object
        BinaryTree tree = new BinaryTree();

        // build tree from array and get root node
        Node root = tree.buildTree(nodes);

        // print level order traversal
        System.out.println("Level order traversal:");
        tree.levelorder(root);
    }
}
