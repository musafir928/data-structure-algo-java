public class JumpSearch {
    public static void main(String[] args) {
        int[] source = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(jumpSearch(source, 10));
    }


    public static  int jumpSearch(int[] array, int data) {
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while(start < array.length && array[next-1] < data) {
            start=next;
            next+=blockSize;
            if(next>array.length) next = array.length;
        }

        for(int i=start; i<next; i++) {
            if (array[i] == data) {
                return i;
            }
        }

        return -1;
    }
}
