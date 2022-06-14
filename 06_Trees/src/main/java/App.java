public class App {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = {10, 5, 12,3,6,11,13,2};
        for (int number : numbers) {
            tree.insert(number);
        }

        VisualizeTree.printTree(tree.root, null, false);

        System.out.println("preOrder traversal:");
        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("inOrder traversal:");
        tree.inOrderTraversal(tree.root);

        System.out.println();
        System.out.println("postOrder traversal:");
        tree.postOrderTraversal(tree.root);

        System.out.println();
        System.out.println("breadth first traversal:");

        System.out.println();
        System.out.println("tree.depthSum(tree.root, 0) = " + tree.depthSum(tree.root, 0));
    }
}
