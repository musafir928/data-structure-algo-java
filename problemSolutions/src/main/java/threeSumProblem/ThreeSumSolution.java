package threeSumProblem;

import java.util.*;

// ==== note ==== //
/**
     possible questions:
         1. is there any duplication in the array?
         2. are duplications to be considered?
            or in other words is the result should be unique or get the all?
         3. is the array sorted?
         4. is there any BigO requirement?
  */
// ==== note ==== //
public class ThreeSumSolution {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,4,5,-1, -4,-5,-7};
        int target = 0;
        System.out.println(threeSumPointersSolution(myArray, target));
        System.out.println(threeSumHashMapSolution(myArray, target));
    }

    // two pointer solution
    public static List<List<Integer>> threeSumPointersSolution(int[] array, int target) {
        Arrays.sort(array); // nlog n
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i =0; i < array.length-2; i++) {
            int left = i+1;
            int right = array.length-1;
            while (left < right) {
                int currentSum = array[i] + array[left] + array[right];
                if (currentSum == target) {
                    triplets.add(Arrays.asList(array[i], array[left] , array[right]));
                    if (array[left] == array[left+1]) {
                        left++;
                    } else if (array[right] == array[right-1]) {
                        right--;
                    } else {
                        left++;
                        right--;
                    }
                    // left++;
                    // right--;
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return triplets;
    }
    // ==== note ==== //
    // if the answer of question 1 is 'yes' and 2nd is 'no': line 42,43 must be used and 32~41 must be commented
    // if the both answer for question 1 and 2 are 'yes': line 32 ~ 41 must be used and 42,43 must be commented
    // ==== note ==== //

    // hash map solution
    public static List<List<Integer>> threeSumHashMapSolution (int[] array, int target) {
        // Set<List<Integer>> result = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(array); // nlog n
        HashMap<Integer, Integer> potentialMatch = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            potentialMatch.put(array[i], i);
        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                List<Integer> triplet = new ArrayList<>();
                int currentLookUp = target - array[i] - array[j];
                if (potentialMatch.containsKey(currentLookUp) && potentialMatch.get(currentLookUp) > j) {
                    triplet.add(array[i]);
                    triplet.add(array[j]);
                    triplet.add(currentLookUp);
                    result.add(triplet);
                }
            }
        }
        // return new ArrayList(result);
        return result;
    }

}
