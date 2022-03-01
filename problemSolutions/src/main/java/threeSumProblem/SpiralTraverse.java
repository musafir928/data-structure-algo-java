package threeSumProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralTraverse {
    public static void main(String[] args) {
        int[][] matrix = {
                            {1,2,3,4},
                            {12,13,14,5},
                            {11,16,15,6},
                            {10,9,8,7},
                        };
        int[][] matrix1 = {
                            {1,2,3},
                            {4,5,6},
                            {7,8,9}
                        };
        spiralTraverseIterativeSolution1(matrix).forEach(System.out::println);
        spiralTraverseIterativeSolution1(matrix1).forEach(System.out::println);
    }

    public static List<Integer> spiralTraverseIterativeSolution1(int[][] array) {
        if (array.length == 0) return new ArrayList<>();
        int start = 0;
        int end = array.length-1;

        var result = new ArrayList<Integer>();

        while (start < end) {
            // up row
            for (int i = start, j = start; j<= end; j++) {
                result.add(array[i][j]);
            }
            // right column
            for (int i = start+1, j = end; i<= end; i++) {
                result.add(array[i][j]);
            }
            // bottom row
            for (int i = end, j = end-1; j>=start; j--) {
                result.add(array[i][j]);
            }
            // left column
            for (int i = end-1, j = start; i >= start+1; i--) {
                 result.add(array[i][j]);
            }
            start++;
            end--;
        }

        if(start == end) {
            result.add(array[start][end]);
        }

        return result;
    }

}
