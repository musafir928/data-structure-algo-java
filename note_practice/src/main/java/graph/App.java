package graph;

public class App {
    public static void main(String[] args) {
        Graph mg = new Graph();
        mg.addVertex("A");
        mg.addVertex("B");
        mg.addVertex("C");
        mg.addVertex("D");

        mg.addEdge("A","B");
        mg.addEdge("A","C");
        mg.addEdge("B","C");
        mg.addEdge("A","D");
        mg.addEdge("B","D");

        System.out.println(mg);

        mg.removeVertex("D");

        System.out.println(mg);
    }
}
