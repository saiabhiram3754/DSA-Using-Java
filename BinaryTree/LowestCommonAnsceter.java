import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

public class LowestCommonAnsceter {

    // Function to find path from root to given node
    static boolean findPath(TreeNode root, int n, ArrayList<Integer> path) {
        if (root == null) return false;

        // Add current node to path
        path.add(root.val);

        // If current node is the target
        if (root.val == n) return true;

        // Check left and right subtree
        if (findPath(root.left, n, path) || findPath(root.right, n, path)) {
            return true;
        }

        // If not found → remove this node from path
        path.remove(path.size() - 1);
        return false;
    }

    // Function to find LCA using two paths
    static int findLCA(TreeNode root, int n1, int n2) {
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();

        // Find paths from root to n1 and n2
        if (!findPath(root, n1, path1) || !findPath(root, n2, path2)) {
            return -1; // if either node not present
        }

        // Compare paths
        int i = 0;
        while (i < path1.size() && i < path2.size()) {
            if (!path1.get(i).equals(path2.get(i))) break;
            i++;
        }
        return path1.get(i - 1); // last common element
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

        int n1 = 4, n2 = 5;
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + findLCA(root, n1, n2));

        n1 = 4; n2 = 6;
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + findLCA(root, n1, n2));

        n1 = 6; n2 = 7;
        System.out.println("LCA of " + n1 + " and " + n2 + " is: " + findLCA(root, n1, n2));
    }
}
