public class TerneraySearch {
    public static void main(String[] args) {
        int[] source = {0,1,2,3,4,5,6,7,8,9,10};
        System.out.println(ternerySearchRecursion(source, 5, 0, source.length - 1));
        System.out.println(ternarySearch(source, 5));
    }

    public static int ternerySearchRecursion(int[] array, int data, int left, int right) {
        if (left > right) return -1;
        int partition = (right - left) / 3;
        int middle1 = left + partition;
        int middle2 = right - partition;

        if (array[middle1] == data) return middle1;
        if (array[middle2] == data) return middle2;

        if(data<array[middle1]) return ternerySearchRecursion(array, data, left, middle1-1);
        if(data>array[middle2]) return ternerySearchRecursion(array, data, middle2+1, right);

        return ternerySearchRecursion(array, data, middle1+1, middle2-1);
    }

    public static int ternarySearch(int[] array, int data) {
        int left = 0;
        int right = array.length;
        while(right>=left) {
            int partition = (right - left) / 3;
            int middle1 = left + partition;
            int middle2 = right - partition;

            if (array[middle1] == data) return middle1;
            if (array[middle2] == data) return middle2;

            if(data<array[middle1]) {
                right = middle1 -1;
            }
             else if(data>array[middle2]) {
                left = middle2 + 1;
            } else {
                 left = middle1 +1;
                 right = middle2 -1;
            }

        }

        return -1;
    }
}
