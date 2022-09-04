package trees.binarytrees;

/*
 * Time Complexity - O(n)
 * Space Complexity - O(n) (Worst case, Best case - O(log(n))) (Size of recursive call stack)
 * n - number of nodes
 */

public class UniValuedTree {
    
    public static boolean isUniValued(TreeNode<Integer> root, int val) {
        if (root == null)
            return true;
        
        if (root.val != val)
            return false;
            
        return isUniValued(root.left, val) && isUniValued(root.right, val);
    } 

    public static void main(String [] args) {
        TreeNode<Integer> root = null;
        root = BinaryTree.createBinaryTree();
        boolean res = isUniValued(root, root.val);
        System.out.println("Is the tree univalued? " + res);
    }

}