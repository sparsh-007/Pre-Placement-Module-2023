class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        if(m < 1 || n < 1 || matrix == null){
            return false;
        }
        int lo = 0;
        int hi = m - 1;
        int col = n - 1;
        int potRow = 0;
        while(lo <= hi){
            int mid = lo + ((hi - lo) / 2);
            if(target >= matrix[mid][0] && target <= matrix[mid][col]){
                potRow = mid;
                break;
            } else if(target > matrix[mid][col]){
                lo = mid + 1;
            } else if(target < matrix[mid][0]){
                hi = mid - 1;
            }
        }
        lo = 0;
        hi = n - 1;
        while(lo <= hi){
            int mid = lo + ((hi - lo) / 2);
            if(matrix[potRow][mid] == target){
                return true;
            } else if(target > matrix[potRow][mid]){
                lo = mid + 1;
            } else if(target < matrix[potRow][mid]){
                hi = mid - 1;
            }
        }
        return false;
        
    }
}
