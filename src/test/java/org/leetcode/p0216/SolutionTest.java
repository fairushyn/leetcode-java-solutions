package org.leetcode.p0216;

import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static junit.framework.Assert.assertEquals;
import static org.leetcode.common.CollectionUtils.setOf;

@DisplayName("LeetCode #216.Combination Sum III")
public class SolutionTest {

    private static Stream<Arguments> args() {
        return Stream.of(
                Arguments.of(3, 7, setOf(
                        Arrays.asList(1, 2, 4)
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    @DisplayName("CombinationSum3")
    void test_Combine(int n, int k, Set<List<Integer>> expected) {
        val solution = new Solution();
        assertEquals(expected, new LinkedHashSet<>(solution.combinationSum3(n, k)));
    }

}
