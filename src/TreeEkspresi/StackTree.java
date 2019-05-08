package TreeEkspresi;

public class StackTree {

    private ListTree stackListTree;

    public StackTree() {
        stackListTree = new ListTree();
    }

    public void push(TreeNode node) {
        stackListTree.insertAtFront(node);
    }

    public TreeNode pop() {
        return stackListTree.removeFromFront();
    }

    public boolean isEmpty() {
        return stackListTree.isEmpty();
    }

    public void print() {
        stackListTree.print();
    }
}
