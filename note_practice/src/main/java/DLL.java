public class DLL {

    public static void main(String[] args) {
        Node n1 = new Node();
        Node n2 = new Node();
        Node n3 = new Node();

        n1.val = 1;
        n2.val = 2;
        n3.val = 3;

        n1.child = null;
        n2.child = null;
        n3.child = null;

        n1.next = n2;
        n2.next = n3;

        n2.prev = n1;
        n3.prev = n2;

        Node.print(flatten(n1).next);
        Node.print(flatten(n1).next.prev);
        Node.print(flatten(n1).prev);
    }

    public static Node flatten(Node head) {
        if (head == null) return null;
        Node current = head;

        while (current.next != null) {
            Node next = current.next;
            Node pointer = current;
            if (current.child != null) {
                current.next = current.child;
                current.child = null;
                current.next.prev = current;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = next;
                next.prev = current;
            }
            current = pointer.next;
        }
        return head;
    }

}
