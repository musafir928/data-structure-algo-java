package LinkedList_Single;

public class isPalindrome {
    public static void main(String[] args) {
        Node node = new Node(0);
        node.next = new Node(1);
        node.next.next = new Node(1);
        node.next.next.next = new Node(1);
        node.next.next.next.next = new Node(0);
        System.out.println(node.isPalindrome(node));
    }
}
