package SinglyLinkedList;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        LinkedList l = new LinkedList(0);
        l.append(new Node(1));
        l.append(new Node(2));
        l.append(new Node(3));
        l.append(new Node(4));
        l.reverse1();
//        l.reverseBtureForce();
        l.print();
    }
}
