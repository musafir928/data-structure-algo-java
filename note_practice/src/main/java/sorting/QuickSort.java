package sorting;

import java.util.Arrays;

public class QuickSort {

//    public static void sort(int[] arr, int left, int right) {
//        if (left < right) {
//            int pivotIndex = Utils.pivot(arr, left, right);
//            sort(arr, left, pivotIndex - 1);
//            sort(arr, pivotIndex + 1, right);
//        }
//    }

    public static void sortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = Utils.pivot(arr, left, right);
            sortHelper(arr, left, pivotIndex - 1);
            sortHelper(arr, pivotIndex + 1, right);
        }
    }

    public static void sort(int[] arr) {
        sortHelper(arr, 0, arr.length);
    }


    public static void main(String[] args) {
        int[] origin = {3, 4, 5, 1, 3, 2, 1};
//        sort(origin, 0, origin.length);
        sort(origin);
        System.out.println(Arrays.toString(origin));
    }
}
