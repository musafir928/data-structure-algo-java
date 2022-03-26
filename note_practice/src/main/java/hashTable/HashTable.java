package hashTable;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        this.dataMap = new Node[size];
    }

    public void print() {
        for (int i = 0; i < dataMap.length; i++) {
            System.out.println(i+": \t");
            Node temp = dataMap[i];
            while(temp !=null) {
                System.out.println(temp.key + ": \t" + temp.value);
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        for (char c : key.toCharArray()) {
            int asciiValue = c;
            hash = (hash + asciiValue*23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node<Integer>(key, value);
        if(dataMap[index]==null) {
            dataMap[index] = newNode;
        } else  {
            Node temp = dataMap[index];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public <T> T get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp!=null) {
            if(temp.key == key) return  (T)temp.value;
            temp = temp.next;
        }
        return null;
    }

    public ArrayList keys() {
        ArrayList<String> allKeys = new ArrayList<>();
        for (Node node : dataMap) {
            Node temp = node;
            while(temp != null) {
                allKeys.add(temp.key);
                temp = temp.next;
            }
        }
        return allKeys;
    }
}
