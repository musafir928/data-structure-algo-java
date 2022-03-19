package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class LongestRange {
    public static void main(String[] args) {
//        int[] array = {1,11,3,0,15,5,2,4,10,7,12,6};
        int[] array = {1,3,5};
        System.out.println(Arrays.toString(longestRange(array)));
    }

    public static int[] longestRange(int[] arr) {
        int[] bestRage = new int[2];
        int longestLength = 0;
        HashMap<Integer, Boolean> numsVisited = new HashMap<>();
        for(int num: arr) {
            numsVisited.put(num, false);
        }
        for(int num: arr) {
            if(numsVisited.get(num)) continue;
            numsVisited.put(num, true);
            int currentLength = 1;
            int left = num-1;
            int right = num+1;
            while(numsVisited.containsKey(left)) {
                numsVisited.put(left, true);
                left--;
                currentLength++;
            }
            while(numsVisited.containsKey(right)) {
                numsVisited.put(right, true);
                right++;
                currentLength++;
            }

            if(currentLength> longestLength) {
                longestLength = currentLength;
                bestRage[0] = ++left;
                bestRage[1] = --right;
            }
        }
        return bestRage;
    }
}
