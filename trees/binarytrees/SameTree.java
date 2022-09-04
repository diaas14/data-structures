package trees.binarytrees;

public class SameTree {

    public static boolean isSame(TreeNode<Integer> root1, TreeNode<Integer> root2) {
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;
        
        if (root1.val != root2.val)
            return false;
        
        return isSame(root1.left, root2.left) && isSame(root1.right, root2.right);
    }

    public static void main(String [] args) {
        TreeNode<Integer> root1 = null, root2 = null;
        root1 = BinaryTree.createBinaryTree();
        System.out.println("Displaying tree 1");
        BinaryTree.inorder(root1);
        System.out.print("\n");
        root2 = BinaryTree.createBinaryTree();
        System.out.println("Displaying tree 2");
        BinaryTree.inorder(root2);
        System.out.print("\n");
        boolean same = isSame(root1, root2);
        System.out.println("The trees are the same: " + same);
    }
}
