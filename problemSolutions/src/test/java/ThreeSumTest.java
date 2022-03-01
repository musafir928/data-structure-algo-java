import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import threeSumProblem.ThreeSumSolution;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThreeSumTest {
    private static Map<String, Object> getSingleData(int[] array, int target, Object expected) {
        return Stream.of(
                new AbstractMap.SimpleEntry<>("array", array),
                new AbstractMap.SimpleEntry<>("target", target),
                new AbstractMap.SimpleEntry<>("expected", expected)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static List<Map<String, Object>> getTestData() {
        return Arrays.asList(
                getSingleData(new int[]{1, 2, 3, 4, 4, 5, -1, -4, -5, -7}, 0, true),
                getSingleData(new int[]{3,5,6,7,-8,-9,-11}, 0, true),
                getSingleData(new int[]{-10,-9,-8,-7,-6,-5,-4,-3,10,2,3,4,5,6,7}, 12, true),
                getSingleData(new int[]{9, 4, 5, 6, 7, 2, 0}, 20, true),
                getSingleData(new int[]{1,2,3,4,5,6}, 20, false)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void threeSumPointersSolutionTest(Map<String, Object> m) {
        int[] array = (int[]) m.get("array");
        int target = (int) m.get("target");
        boolean expected = (boolean) m.get("expected");
        ThreeSumSolution.threeSumPointersSolution(array, target).stream()
                .map(e->e.stream().mapToInt(a->a).sum())
                .forEach(e1->Assertions.assertTrue((target == (int) e1) == expected));

    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void threeSumHashMapSolutionTest(Map<String, Object> m) {
        int[] array = (int[]) m.get("array");
        int target = (int) m.get("target");
        boolean expected = (boolean) m.get("expected");
        ThreeSumSolution.threeSumPointersSolution(array, target).stream()
                .map(e->e.stream().mapToInt(a->a).sum())
                .forEach(e1->Assertions.assertTrue((target == (int) e1) == expected));

    }
}
