public class Node {
    Node left;
    Node right;
    int value;

    public Node() {
    }

    public Node(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "" + value;
    }
}
