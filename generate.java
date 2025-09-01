
/*
 * LeetCode Question 118 Pascal's Triangle
 * 
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly above.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        triangle.add(Arrays.asList(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        generate solution = new generate();

        List<List<Integer>> result1 = solution.generate(5);
        printTriangle(result1);

        List<List<Integer>> result2 = solution.generate(1);
        printTriangle(result2);

        List<List<Integer>> result3 = solution.generate(8);
        printTriangle(result3);
    }

    private static void printTriangle(List<List<Integer>> triangle) {
        for (int i = 0; i < triangle.size(); i++) {
            for (int space = 0; space < triangle.size() - i - 1; space++) {
                System.out.println(" ");
            }

            List<Integer> row = triangle.get(i);

            for (int j = 0; j < row.size(); j++) {
                System.out.printf("%3d ", row.get(j));
            }

            System.out.println();
        }
    }
}
