package DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DLinkedList dl = new DLinkedList(10);
        dl.append(11);
        dl.append(12);
        dl.append(13);
        dl.append(14);
        dl.append(15);
        dl.print();
        System.out.println(dl.remove(4).value);
        dl.print();

    }
}
