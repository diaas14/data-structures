package trees.binarytrees;

public class LeafOrder {
    
    public static String leafOrder(TreeNode<Integer> root) {
        if (root == null) 
            return "";
        if (root.left == null && root.right == null)
            return " " + root.val;
        return leafOrder(root.left) + leafOrder(root.right);
    }

    public static boolean isSameOrder(String order1, String order2) {
        return order1.equals(order2);
    }

    public static void main(String [] args) {
        TreeNode<Integer> root1 = null, root2 = null;
        root1 = BinaryTree.createBinaryTree();
        root2 = BinaryTree.createBinaryTree();
        boolean isSame = isSameOrder(leafOrder(root1), leafOrder(root2));
        System.out.println("Are the leaf orders of the trees the same?: " + isSame);
    }
}
