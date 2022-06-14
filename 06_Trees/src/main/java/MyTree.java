import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    public Node root;

    public MyTree() {
    }

    public MyTree(Node root) {
        this.root = root;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (value <= current.value) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else {
                if (current.right
                        == null) {
                    current.right
                            = newNode;
                    break;
                }
                current = current.right
                ;
            }

        }
    }// end insert

    // PreOrder Traversal of Tree  Root-Left-right


    public void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.value + ", ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right
        );
    }
    // In-Order Traversal of Tree  Root-Left-right

    public void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.right
        );
    }

    // Post-Order traversal  Left-right
    public void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right
        );
        System.out.print(root.value + ", ");

    }

    // Assignment BreadthFirst Traversal
    public void levelOrderTraversal() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node toVisit = queue.poll();
            System.out.print(toVisit.value + ", ");
            if (toVisit.left != null) queue.add(toVisit.left);
            if (toVisit.right
                    != null) queue.add(toVisit.right
            );
        }// end while
    }// end levelOrder

    // task-1 implement contains method
    public boolean contains(int value) {
        if (root == null) return false;
        Node current = root;
        while (current != null) {
            if (value < current.value) current = current.left;
            else if (value > current.value) current = current.right
                    ;
            else return true;
        }
        return false;
    }

    // task -2 return if the node is a leaf
    public boolean isLeaf(Node node) {
        return node.left == null && node.right
                == null;
    }

    // task -3 print leaves of a BST
    public void printLeaves(Node root) {
        if (root == null) return;
        if (isLeaf(root)) System.out.print(root.value + ", ");
        printLeaves(root.left);
        printLeaves(root.right
        );
    }

    // task -4 count leaves of a BST
    public int countLeaves(Node root) {
        if (root == null) return 0;
        if (isLeaf(root)) return 1;
        return countLeaves(root.left) + countLeaves(root.right
        );
    }

    // task -5 sum leaf values of a BST
    public int findSumOfLeaves(Node root) {
        if (root == null) return 0;
        if (isLeaf(root)) return root.value;
        return findSumOfLeaves(root.left) + findSumOfLeaves(root.right
        );
    }

    // task -6 Height of a node in a BST
    public int height(Node root) {
        if (root == null) return -1;
        if (isLeaf(root)) return 0;
        return 1 + Math.max(height(root.left), height(root.right
        ));
    }

    // HW: depth sums
    public int depthSum(Node root, int depth) {
        if(root == null) {return 0;}
        return depth + depthSum(root.left, depth+1) + depthSum(root.right, depth+1);
    }
}
