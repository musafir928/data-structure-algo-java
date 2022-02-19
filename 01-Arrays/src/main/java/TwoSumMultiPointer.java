import java.util.Arrays;

public class TwoSumMultiPointer {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSumMultiPointers(new int[]{1, 2, 3, 4}, 7)));
        System.out.println(Arrays.toString(twoSumMultiPointers(new int[]{4,1,2,3}, 7)));
        System.out.println(Arrays.toString(twoSumMultiPointers(new int[]{2,11,3,4,6,7,8,9}, 7)));
    }

    public static int[] twoSumMultiPointers(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while (left < right) {
            int result = arr[left] + arr[right];
            if(result > target) {
                if(arr[left] > arr[right]) {
                    left++;
                } else {
                    right--;
                }
            } else if(result < target) {
                if(arr[left] > arr[right]) {
                    right--;
                } else {
                    left++;
                }
            } else {
                return new int[]{left, right};
            }
        }
        return new int[]{};
    }
}
