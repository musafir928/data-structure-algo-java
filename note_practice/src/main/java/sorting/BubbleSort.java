package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = arr.length-1; i > 0 ;i--) {
            for (int j = 0; j < i; j++) {
                if(arr[j] > arr[j+1]) {
                    // swap two values
                    Utils.swap(arr, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] origin = {3,4,5,1,3,2,1};
        sort(origin);
        System.out.println(Arrays.toString(origin));
    }
}
