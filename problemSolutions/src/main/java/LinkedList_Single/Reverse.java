package LinkedList_Single;

public class Reverse {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);

        System.out.println("before reverse");
        node.print();

        node = node.reverse(node);

        System.out.println(" \nafter reverse");
        node.print();

        node = node.reverseRecursion(node);

        System.out.println(" \nafter reverse");
        node.print();


    }
}
