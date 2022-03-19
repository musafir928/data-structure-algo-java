package LRUCache;

import java.util.HashMap;

public class LRUCache {

    public class Dnode {
        int key;
        int value;
        Dnode prev;
        Dnode next;

        public Dnode(){}

        public Dnode (int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    HashMap<Integer, Dnode> cacheMap = new HashMap<>();

    int size;
    int capacity;
    Dnode head;
    Dnode tail;

    public LRUCache(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.head = new Dnode();
        this.tail = new Dnode();
        head.next = tail;
        tail.prev = head;
    }

    public void removeNode(Dnode node) {
        Dnode prev = node.prev;
        Dnode next = node.next;

        prev.next = next;
        next.prev = prev;
    }

    public void addNode(Dnode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    public void moveToHead(Dnode node) {
        removeNode(node);
        addNode(node);
    }

    public Dnode popTail() {
        Dnode popped = tail.prev;
        removeNode(popped);
        return popped;
    }

    public int get(int key) {
        Dnode node = cacheMap.get(key);
        if(node==null) return -1;
        moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        Dnode node = cacheMap.get(key);
        if(node==null) {
            Dnode newNode = new Dnode(key, value);
            cacheMap.put(key, newNode);
            addNode(newNode);
            size++;
        }
    }
}
