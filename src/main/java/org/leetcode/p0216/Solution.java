package org.leetcode.p0216;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> candidate = new LinkedList<Integer>();
        backtrack(k, n, 0, candidate, result);
        return result;
    }

    private void backtrack(int k, int n, int first, LinkedList<Integer> candidate, List<List<Integer>> result) {
        if (candidate.size() == k && n == 0) {
            result.add(new LinkedList(candidate));
        } else if (n < 0 || candidate.size() == k) {
            return;
        }

        for (int i = first; i < 9; i++) {
            candidate.add(i + 1);
            backtrack(k, n - i -1, i + 1, candidate, result);
            candidate.removeLast();
        }
    }
}
