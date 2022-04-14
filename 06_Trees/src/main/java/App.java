public class App {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = {10,5,12,3,6,11,13,2};
        for (int number : numbers) {
            tree.insert(number);
        }

        VisualizeTree.printTree(tree.root, null, false);
    }
}
