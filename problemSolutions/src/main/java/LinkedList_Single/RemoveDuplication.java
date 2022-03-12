package LinkedList_Single;

public class RemoveDuplication {
    public static void main(String[] args) {
        Node node = new Node(0);
        node.next = new Node(1);
        node.next.next = new Node(1);
        node.next.next.next = new Node(1);
        node.next.next.next.next = new Node(2);

        node.removeDuplication();
        node.print();

    }
}
