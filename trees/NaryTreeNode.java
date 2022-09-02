package trees;

public class NaryTreeNode<T>{
    public T val;
    public NaryTreeNode<T> [] children;

    NaryTreeNode (T val, NaryTreeNode<T> []  children) {
        this.val = val;
        this.children = children;
    }

    NaryTreeNode (T val) {
        this(val, null);
    }
}
