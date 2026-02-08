class Solution {
    public boolean binarySearch(int row, int st, int end, int[][] matrix, int target) {
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int stRow = 0;
        int endRow = matrix.length - 1;

        while (stRow <= endRow) {
            int mid = stRow + (endRow - stRow) / 2;

            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] < target) {
                stRow = mid + 1;
            } else {
                endRow = mid - 1;
            }
        }

        if (endRow < 0) return false; 
        int row = endRow;

        return binarySearch(row, 0, matrix[0].length - 1, matrix, target);
    }
}