package org.leetcode.p0200;

import lombok.val;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static junit.framework.Assert.assertEquals;


@DisplayName("LeetCode #200.Number of Islands")
public class SolutionTest {

    private static Stream<Arguments> args() {
        return Stream.of(

                Arguments.of(new char[][]{
                        {'1', '1', '0', '0', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '1', '0', '0'},
                        {'0', '0', '0', '1', '1'}
                }, 3),

                Arguments.of(new char[][]{
                        {'1', '1', '1', '1', '0'},
                        {'1', '1', '0', '1', '0'},
                        {'1', '1', '0', '0', '0'},
                        {'0', '0', '0', '0', '0'}
                }, 1),

                Arguments.of(new char[][]{
                        {'1', '1', '1', '1', '1', '1', '0'},
                        {'1', '0', '0', '0', '0', '1', '0'},
                        {'1', '1', '0', '1', '1', '1', '0'},
                        {'0', '1', '0', '0', '0', '0', '0'},
                        {'1', '1', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '0', '0', '1'}
                }, 2),

                Arguments.of(new char[][]{
                        {'1', '1', '1', '1', '1', '1', '0'},
                        {'1', '0', '0', '0', '0', '1', '0'},
                        {'1', '1', '0', '1', '1', '1', '0'},
                        {'0', '1', '0', '0', '0', '0', '0'},
                        {'1', '1', '0', '0', '0', '0', '0'},
                        {'0', '0', '0', '0', '1', '0', '0'},
                        {'0', '0', '0', '0', '1', '0', '1'},
                        {'0', '0', '0', '0', '1', '1', '1'}
                }, 2),

                Arguments.of(new char[][]{
                        {'1', '1', '1', '1', '1', '1', '0', '0', '0'},
                        {'1', '0', '0', '0', '0', '1', '0', '0', '0'},
                        {'1', '1', '0', '1', '1', '1', '0', '0', '0'},
                        {'0', '1', '0', '0', '0', '0', '0', '0', '0'},
                        {'1', '1', '0', '0', '0', '0', '1', '1', '1'},
                        {'0', '0', '0', '0', '1', '0', '1', '0', '1'},
                        {'0', '0', '0', '0', '1', '0', '1', '1', '1'},
                        {'0', '0', '0', '0', '1', '1', '1', '1', '1'}
                }, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("args")
    @DisplayName("NumIslands")
    void test_NumIslands(char[][] grid, int expected) {
        val solution = new Solution();
        assertEquals(expected, solution.numIslands(grid));
    }
}
