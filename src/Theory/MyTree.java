package Theory;

public class MyTree {
    protected int size;
    protected Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = null;
    }

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        Node temp = root;

        if (root == null) {
            root = newNode;
        }
        while (temp != null) {
            if (temp.data < data) {
                temp = temp.right;
            }
            if (temp.data > data) {
                temp = temp.left;
            } else return;
        }
        temp = newNode;

    }

    public static void main(String[] args) {
        MyTree myTree = new MyTree();
        myTree.insert(10);
        myTree.insert(11);
        myTree.insert(12);
        myTree.insert(13);
    }
}
