package hashTable;

public class App {
    public static void main(String[] args) {
        HashTable ht = new HashTable();
        ht.set("adil", 35);
        ht.set("abdullah", 1);
        ht.set("asiye", 10);
        ht.set("maryam", 8);
        ht.set("helchem", 5);
        ht.set("nurgul", 36);

        System.out.println("ht.get(\"maryam\") = " + ht.get("maryam"));
        System.out.println("ht.get(\"maryamjan\") = " + ht.get("maryamjsn"));
        System.out.println("ht.keys() = " + ht.keys());
    }
}
