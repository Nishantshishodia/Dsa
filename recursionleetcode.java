import java.util.Scanner;
//without input code of leetcode 74 problem of 2d matrix

public class recursionleetcode {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) {
            return false;
        }
        int n = matrix[0].length;
        // binary search repersentation
        int low = 0;
        int high = m * n - 1;
        int mididx;
        int midelement;
        int rowidx;
        int colidx;
        while (low <= high) {
            mididx = low + (high - low) / 2;
            rowidx = mididx / n;
            colidx = mididx % n;
            midelement = matrix[rowidx][colidx];
            if (target == midelement) {
                return true;
            } else {
                if (target < midelement) {
                    high = mididx - 1;
                } else {
                    low = mididx + 1;
                }
            }
        }
        return false;
    }
}