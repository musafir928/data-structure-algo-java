class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    @Override
    public String toString() {
        return "" + val;
    }

    public static void print(Node node) {
        while (node != null) {
            System.out.print(node.val + " <=> ");
            node = node.next;
        }
        System.out.println("null");
    }
}