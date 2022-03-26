package queue;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue(int value) {
        Node newNode = new Node(value);
        first = newNode;
        last = newNode;
        length = 1;
    }

    public Node getFirst() {
        return first;
    }

    public Node getLast() {
        return last;
    }

    public int length() {
        return length;
    }

    public void print() {
        Node current = first;
        while(current!=null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(length == 0) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public Node dequeue() {
        if(length == 0) {
            return null;
        }
        Node dequeued = first;
        if(length == 1) {
            first = last = null;
        } else {
            first = first.next;
            dequeued.next = null;
        }
        length--;
        return dequeued;
    }
}
