package customLinkedListImplementation;

public class App {
    public static void main(String[] args) {
        CustomNode node0 = new CustomNode(0);
        CustomNode node1 = new CustomNode(1);
        CustomNode node2 = new CustomNode(2);
        CustomNode node3 = new CustomNode(3);
        CustomNode node4 = new CustomNode(4);

        node0.nextCustomNode = node1;
        node1.nextCustomNode = node2;
        node2.nextCustomNode = node3;
        node3.nextCustomNode = node4;

        // iteration
        CustomNode current = node0;
        while (current != null) {
            System.out.println("node0.data = " + current.data);
            current = current.nextCustomNode;
        }
    }
}
