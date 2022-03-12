package LinkedList_Single;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Node {
    int value;
    Node next;

    public Node (int value) {
        this.value = value;
    }

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    Node reverseRecursion(Node node)
    {
        if (node == null || node.next == null)
            return node;

        Node rest = reverseRecursion(node.next);
        node.next.next = node;
        node.next = null;

        return rest;
    }

    void removeDuplication () {
        Node curr = this;
        while (curr != null) {
            Node temp = curr;
            while(temp!=null && temp.value==curr.value) {
                temp = temp.next;
            }
            curr.next = temp;
            curr = curr.next;
        }
    }

    boolean equals(Node node) {
        Node current1 = node;
        Node current2 = this;
        while(current1 != null && current2 != null) {
            if(current1.value !=  current2.value) {
                return false;
            }
            current1 = current1.next;
            current2 = current2.next;
        }
        return true;
    }

    boolean isPalindrome (Node node) {
        Node tem = node;
        return tem.equals(this.reverseRecursion(this));
    }

    Node sort(Node node) {
        Node newList = new Node(1);
        newList.next = node;
        Node curr = node;
        while(curr.next != null) {
            newList.next = max(curr.next);
            newList = newList.next;
        }
        return newList.next;
    }

    Node max(Node node) {
        Node current = new Node(Integer.MIN_VALUE);
        while (node != null) {
            if (current.value < node.value) {
                current = node;
                node = node.next;
            }
        }
        return current;
    }

    void print() {
        Node current = this;
        while(current != null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}
