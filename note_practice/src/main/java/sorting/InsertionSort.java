package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j > -1 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }


    public static void main(String[] args) {
        int[] origin = {3,4,5,1,3,2,1};
        sort(origin);
        System.out.println(Arrays.toString(origin));
    }
}
