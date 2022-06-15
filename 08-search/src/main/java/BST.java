public class BST {
    public static void main(String[] args) {
        int[] source = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearchTree(source, 5));
        System.out.println(BSTRecursive(source, 5, 0, source.length-1));
    }

    public static int binarySearchTree(int[] array, int data) {
        int left = 0;
        int right = array.length;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == data) {
                return middle;
            } else if (array[middle] < data) {
                left = middle+1;
            } else {
                right = middle-1;
            }
        }
        return -1;
    }

    public static int BSTRecursive(int[] array, int data, int left, int right) {
        if(left>right) return -1;
        int middle = (left + right) / 2;
        if (array[middle] == data) {
            return middle;
        } else if (array[middle] < data) {
            return BSTRecursive(array,data, middle+1, right);
        } else {
            return BSTRecursive(array,data, left, middle-1);
        }
    }
}
