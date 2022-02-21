import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Stream;

public class TwoSumTest {

    private static Stream<List<Serializable>> getTestData() {
        return Stream.of(
                Arrays.asList(new int[]{4, 0, 6, 2, 6, 8, 1}, 9, new int[]{5, 6}),
                Arrays.asList(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, 16, new int[]{7, 9}),
                Arrays.asList(new int[]{9, 4, 5, 6, 7, 2, 0}, 10, new int[]{1, 3}),
                Arrays.asList(new int[]{9, 4, 5, 6, 7, 2, 0}, 100, new int[]{})
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void TwoSumMultiPointerTest(List<Serializable> l) {
        int[] origin = (int[]) l.get(0);
        int target = (int) l.get(1);
        int[] expected = (int[]) l.get(2);
        System.out.println(target);
       Assertions.assertArrayEquals(expected, TwoSumMultiPointer.twoSumMultiPointers(origin, target));
    }


}
