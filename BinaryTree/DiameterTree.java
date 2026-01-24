// Max Diameter of a tree
// two cases: 1. Max Diameter is passing through the root node
//            2. Max Diameter is not passing through the root node

// import java.util.*;

// public class Diameter{
//     static class Node{
//         int data;
//         Node left;
//         Node right;
//         public Node(int data){
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }
//     public static int height(Node root){
//         if(root == null){
//             return 0;
//         }
//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.min(rh,lh)+1; 
//     }

//     public static int diameter(Node root){    // O(n^2)
//         if(root == null){
//             return 0;
//         }

//         int leftDia = diameter(root.left);
//         int lh = height(root.left);
//         int rightDia = diameter(root.right);
//         int rh = height(root.right);

//         int throughRoot = lh + rh + 1;  // passing through root
        
//         return Math.max(throughRoot, Math.max(leftDia, rightDia)); // math function for not passing through root
//     }

//     public static void main(String [] args){
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root));
//     }
// }


import java.util.*;

public class DiameterTree {

    // Node class
    static class Node {
        int data;
        Node left, right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Info class to hold diameter and height
    static class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    // Function to calculate diameter
    public static Info diameter(Node root) {     //O(n)
    
        if (root == null) {
            return new Info(0, 0);   
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int maxdiam = Math.max(Math.max(leftInfo.diam, rightInfo.diam),leftInfo.ht + rightInfo.ht + 1);
        int maxht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new Info(maxdiam, maxht);
    }

    // Driver code
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Diameter of the tree: " + diameter(root).diam);
    }
}
