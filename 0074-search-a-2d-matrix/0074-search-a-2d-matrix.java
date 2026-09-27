class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i =0 ; 
        int row = matrix.length ;
        int col = matrix[0].length ;
        int j = row * col -1 ;

        while ( i <= j) {
            int mid = i+ (j-i) /2 ;
            int rowIndex = mid / col ;
            int colIndex = mid % col ;

            if(matrix[rowIndex][colIndex] == target) {
                return true ;
            }else if (matrix[rowIndex][colIndex] > target) {
               j = mid -1 ;
            } else {
                i = mid+1 ;
            }
        }
        return false ;
    }
}