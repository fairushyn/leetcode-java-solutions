package org.leetcode.p0077;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        LinkedList<Integer> candidate = new LinkedList<Integer>();
        backtrack(k, n, 1, candidate, result);
        return result;
    }

    private void backtrack(int k, int n, int first, LinkedList<Integer> candidate, List<List<Integer>> result) {
        if(candidate.size() == k){
            result.add(new LinkedList<Integer>(candidate));
        }
        for (int i = first; i < n + 1; i++){
            candidate.add(i);
            backtrack(k, n, i + 1, candidate, result);
            candidate.removeLast();
        }
    }
}
