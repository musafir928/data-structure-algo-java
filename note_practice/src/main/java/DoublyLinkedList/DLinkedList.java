package DoublyLinkedList;

import lombok.ToString;

public class DLinkedList {
    private Node head;
    private Node tail;
    private int size = 0;


    public DLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    public void print() {
        Node temp = head;
        while(temp!=null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void getHead() {
        System.out.println("head.value = " + head.value);
    }

    public void getTail() {
        System.out.println("tail.value = " + tail.value);
    }

    public int size() {
        System.out.println("size = " + size);
        return size();
    }

    // custom functions
    public boolean append(int value) {
        Node newNode = new Node(value);
        if(size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
        return true;
    }

    public Node removeLast() {
        Node newNode = tail;
        if(size<=1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            newNode.prev = null;
        }
        if(size>=1) { size--;}
        return newNode;
    }

    public Node removeFirst() {
        Node newNode = head;
        if(size<=1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
            newNode.next = null;
        }
        if(size>=1) { size--;}
        return newNode;
    }

    public boolean prepend(int value) {
        Node newNode = new Node(value);
        if(size==0) {head = tail = newNode;}
        else {
            newNode.next = head;
            head.prev = newNode;
            head= newNode;
        }
        size++;
        return true;
    }
    
    public Node get(int index){
        if(index<0 || index >=size) return null;
        Node newNode = head;
        if(index < size/2) {
            for (int i = 0; i < index; i++) {
                newNode = newNode.next;
            }
        } else {
            newNode = tail;
            for (int i = size-1; i > index; i--) {
                newNode = newNode.prev;
            }
        }
        return newNode;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);
        if(temp !=null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index<0 || index > size) return false;
        Node newNode = new Node(value);
        if(index==0) {
            return prepend(value);
        } else if(index==size) {
            return append(value);
        } else {
            Node prev = get(index-1);
            newNode.prev = prev;
            newNode.next = prev.next;
            prev.next.prev = newNode;
            prev.next = newNode;
            size++;
            return true;
        }
    }

    public Node remove(int index) {
        if(index<0 || index > size) return null;
        if(index==0) {
            return removeFirst();
        } else if(index==size-1) {
            return removeLast();
        }
            Node removed = get(index);

            // removing logic
            removed.next.prev = removed.prev;
            removed.prev.next = removed.next;

            // shaping the returning value
            removed.prev = null;
            removed.next = null;
            size--;

            return removed;
    }


}
