package LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache2 extends LinkedHashMap<Integer, String> {
    int capacity;

    public LRUCache2( int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

    public void put(int key, String value) {super.put(key, value);}

    public String get(int key) {return super.getOrDefault(key, null);}


    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return super.size() > capacity;
    }
}
