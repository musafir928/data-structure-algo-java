package hashTable;

import lombok.ToString;

@ToString
public class Node<T> {
    String key;
    T value;
    Node next;

    public Node(String key, T value) {
        this.key = key;
        this.value = value;
    }
}
