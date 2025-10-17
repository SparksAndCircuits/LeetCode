package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Leetcode question 119: Pascal's Triangle II
 * 
 * Given an integer rowIndex, return teh rowIndex th (0-indexed) row of the Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above. 
 * 
 * Constraints:
 * 0 <= rowIndex <= 33
 */
public class GetRow {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            for (int j = row.size() - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }

            row.add(1);
        }

        return row;
    }
}
