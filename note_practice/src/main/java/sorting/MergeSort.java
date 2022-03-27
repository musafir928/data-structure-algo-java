package sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8};
        int[] arr2 = {1,3,5,7, 8};
        System.out.println("result = " + Arrays.toString(Utils.merge(arr1, arr2)));
    }

    public static int[] sort(int[] arr) {
        if(arr.length == 1) return arr;

        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        return Utils.merge(sort(left), sort(right));
    }
}
