package SinglyLinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        size = 1;
    }

    // print methode
    public void print() {
        if(size == 0) {
            System.out.println("this list is empty");
            return;
        }
        Node current = head;
        while(current!=null) {
            System.out.print(current.value + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void getHead() {
        if(size == 0) {
            System.out.println("this list is empty");
            return;
        }
        System.out.println("Head: \t" + head.value);
    }

    public void getTail() {
        if(size == 0) {
            System.out.println("this list is empty");
            return;
        }
        System.out.println("Tail: \t" + tail.value);
    }

    public void size() {
        System.out.println("size: \t" + this.size);
    }

    public void append(Node node) {
        if(head == null) {
            head = node;
            tail = node;
            size = 1;
        } else {
          this.tail.next = node;
          this.tail = node;
          size++;
        }
    }

    public void prepend(Node node) {
        if(head == null) {
            head = node;
            tail = node;
            size = 1;
        } else {
            node.next = head;
            head = node;
            size++;
        }
    }

    public Node removeLast() {
        Node tem;
        if(size <= 1) {
            tem = head;
            tem = head;
            head = null;
            tail = head;
        } else {
            Node lastPrev = head;
            while(lastPrev.next != tail) {
                lastPrev = lastPrev.next;
            }
            tem = tail;
            tail = lastPrev;
            tail.next = null;
        }
        tem.next = null;
        size--;
        return tem;
    }

    public Node removeFirst() {
        Node tem;
        if(size == 0) {
            head = null;
            tail = head;
            tem = null;
        }else if(size==1){
            tem = head;
            head = null;
            tail = head;
        } else {
            tem = head;
            head = head.next;
        }
        tem.next = null;
        size--;
        return tem;
    }

    public Node get(int index) {
        if(index<0 || index >=size) return null;
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public boolean insert(int index, Node node) {
        if(index<0 || index >size) return false;
        if(index == 0) {
            prepend(node);
            size++;
            return true;
        }
        if(index == size) {
            append(node);
            size++;
            return true;
        }
        Node prev = get(index-1);
        node.next = prev.next;
        prev.next = node;
        size++;
        return true;
    }

    public boolean set(int index, int value) {
        if(index<0 || index >size) return false;
        get(index).value = value;
        return true;
    }

    public Node remove(int index) {
        if(index<0 || index >=size) return null;
        if(index == 0) return removeFirst();
        if(index == size-1) return removeLast();
        Node prev = get(index-1);
        Node removed = get(index);
        prev.next = prev.next.next;
        removed.next = null;
        return removed;
    }

    public void reverse() {
        // swap tail and head
        Node tem = head;
        head= tail;
        tail = tem;
        // define prev
        Node prev = null;
        Node after;
        for (int i = 0; i < size; i++) {
            after = tem.next;
            tem.next = prev;
            prev = tem;
            tem = after;
        }
    }

    public void reverseBtureForce() {
        for(int i= size-1; i>=0; i--) {
            get(i).next = get(i-1);
        }
        Node tem = head;
        head= tail;
        tail = tem;
    }

}
