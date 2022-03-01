import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import threeSumProblem.SpiralTraverse;
import threeSumProblem.ThreeSumSolution;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class spiralTraverseTest {
    private static Map<String, Object> getSingleData(int[][] array, List<Integer> expected) {
        return Stream.of(
                new AbstractMap.SimpleEntry<>("array", array),
                new AbstractMap.SimpleEntry<>("expected", expected)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static List<Map<String, Object>> getTestData() {
        return Arrays.asList(
                getSingleData(new int[][]{{1,2,3}, {8,9,4}, {7,6,5}}, Arrays.asList(1,2,3,4,5,6,7,8,9)),
                getSingleData(new int[][]{{1,2,3,4},{12,13,14,5}, {11,16,15,6}, {10,9,8,7},}, Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16)),
                getSingleData(new int[][]{
                        {1 , 2, 3, 5, 6, 7},
                        {11,12,13, 15,16,17},
                        {21,22,23, 25,26,27},
                        {31,32,33, 35,36,37},
                        {41,42,43, 45,46,47},
                        {51,52,53, 55,56,57},
                }, Arrays.asList(1,2,3,5,6,7,17,27,37,47,57,56,55,53,52,51,41,31,21,11,12,13,15,16,26,36,46,45,43,42,32,22,23,25,35,33)),
                getSingleData(new int[][]{{1,2}, {3,4}}, Arrays.asList(1,2,4,3))
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void threeSumPointersSolutionTest(Map<String, Object> m) {
        int[][] array = (int[][]) m.get("array");
        List<Integer> expected = (List<Integer>) m.get("expected");
        Assertions.assertEquals(expected,SpiralTraverse.spiralTraverseIterativeSolution1(array));

    }
}
