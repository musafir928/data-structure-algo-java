package LRUCache;

import java.util.LinkedHashMap;

public class App {
    public static void main(String[] args) {
//        LRUCache lru = new LRUCache(3);
//        lru.put(1,1);
//        lru.put(2,2);
//        lru.put(3,3);
//        System.out.println(lru.get(1));

        LRUCache2 lru = new LRUCache2(3);
        lru.put(1,"1");
        lru.put(2,"2");
        lru.put(3,"3");
        System.out.println(lru.get(1));
        System.out.println(lru.capacity);
        lru.put(5,"5");
        System.out.println(lru.get(2));
    }
}
