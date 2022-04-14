package InterviewPreparation;

import java.util.Arrays;

public class GetFactorialForRest {
    public static void main(String[] args) {
        int[] origin = {4,5,6,1};
        int[] origin1 = {1};
        int[] origin2 = {};
        int[] origin3 = {4,5};
        System.out.println(Arrays.toString(getFactorialOfTheRest(origin)));
        System.out.println(Arrays.toString(getFactorialOfTheRest(origin1)));
        System.out.println(Arrays.toString(getFactorialOfTheRest(origin2)));
        System.out.println(Arrays.toString(getFactorialOfTheRest(origin3)));

        System.out.println("optimized solution");

        System.out.println(Arrays.toString(getArrayOfProducts(origin)));
        System.out.println(Arrays.toString(getArrayOfProducts(origin1)));
        System.out.println(Arrays.toString(getArrayOfProducts(origin2)));
        System.out.println(Arrays.toString(getArrayOfProducts(origin3)));
    }

    public static int[] getFactorialOfTheRest(int[] arr) {
        if(arr.length <= 1) return new int[]{};
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            arr[i]=1;
            result[i] = getfactorial(arr);
            arr[i] = current;
        }
        return result;
    }

    public static int getfactorial(int[] arr) {
        return Arrays.stream(arr).reduce(1,(s,e)-> s*e);
    }


    // optimized solution
    public static int[] getArrayOfProducts(int[] array) {
        if(array.length <= 1) return new int[]{};
        int[] products = new int[array.length];

        int leftRunningProduct = 1;
        for (int i = 0; i < array.length; i++) {
            products[i] = leftRunningProduct;
            leftRunningProduct *= array[i];
        }

        int rightRunningProduct = 1;
        for (int i = array.length-1; i >=0; i--) {
            products[i] *= rightRunningProduct;
            rightRunningProduct *= array[i];
        }

        return products;
    }
}
