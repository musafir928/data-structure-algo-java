package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]) {
                    minIndex = j;
                }
            }
            Utils.swap(arr, i, minIndex);
        }
    }


    public static void main(String[] args) {
        int[] origin = {3,4,5,1,3,2,1};
        sort(origin);
        System.out.println(Arrays.toString(origin));
    }
}
