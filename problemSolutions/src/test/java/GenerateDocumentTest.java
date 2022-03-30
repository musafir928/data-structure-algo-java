import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import threeSumProblem.ThreeSumSolution;
import InterviewPreparation.GenerateDocument;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GenerateDocumentTest {
    private static Map<String, Object> getSingleData(String chars, String doc, boolean expected) {
        return Stream.of(
                new AbstractMap.SimpleEntry<>("chars", chars),
                new AbstractMap.SimpleEntry<>("doc", doc),
                new AbstractMap.SimpleEntry<>("expected", expected)
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static List<Map<String, Object>> getTestData() {
        return Arrays.asList(
            getSingleData(    "", "",true),
            getSingleData("adil", "",true),
            getSingleData("adil", "dila",true),
            getSingleData("aaaaaa", "aaa",true),
            getSingleData("aaaaaa", "aaab",false),
            getSingleData("aaaaaabbbbdddfsdfsdaf", "aaasdf",true)
        );
    }

    @ParameterizedTest
    @MethodSource("getTestData")
    void threeSumPointersSolutionTest(Map<String, Object> m) {
        String chars = (String) m.get("chars");
        String doc = (String) m.get("doc");
        boolean expected = (boolean) m.get("expected");
        Assertions.assertEquals( expected, GenerateDocument.method1(chars, doc));

    }
}

