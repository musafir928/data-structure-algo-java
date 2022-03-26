package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ItemInCommon {
    public static List itemInCommon(int[] arr1, int[] arr2) {
        HashMap<Integer, Boolean> baseHashMap = new HashMap<>();
        List<Integer> commonItems = new ArrayList<>();
        for(int i : arr1) {
            baseHashMap.put(i, true);
        }

        for (int i : arr2) {
            if (baseHashMap.get(i)!=null) {
                commonItems.add(i);
            }
        }

        return commonItems;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {5,6,7,8,9,10};
        int[] arr3 = {8,9,10};
        System.out.println("itemInCommon(arr1, arr2) = " + itemInCommon(arr1, arr2));
        System.out.println("itemInCommon(arr1, arr2) = " + itemInCommon(arr3, arr1));
    }
}
