import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] myArray = {8,3,4,5,6,2,3,5};
        QuickSort.qsort(myArray, 0, myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }
}
