public class MyTree {
    public Node root;

    public MyTree() {}

    public MyTree(Node root) {this.root = root;}

    public void insert(int value) {
        Node newNode = new Node(value);

        if(root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        while (true) {
            if(value <= current.value) {
                if(current.left == null) {
                    current.left = newNode;
                    break;
                } else {
                    current = current.left;
                }
            }else {
                if(current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    current = current.right;
                }
            }
        }
    }


}
