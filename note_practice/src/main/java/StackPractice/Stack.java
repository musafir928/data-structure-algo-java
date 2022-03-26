package StackPractice;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void print() {
        Node current = top;
        while(current!=null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node getTop() {
        return top;
    }

    public int height() {
        return height;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        if(height==0) {
            top = newNode;
        } else {
             newNode.next = top;
             top = newNode;
        }

        height++;
    }

    public Node pop() {
        if(height == 0) return null;
        Node popped = top;
        top = top.next;
        popped.next = null;
        height--;
        return popped;
    }
}
