package SinglyLinkedList;

import lombok.ToString;

@ToString
public class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}
