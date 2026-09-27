class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix.length ;
        int col = matrix[0].length ;

        for (int i =0 ; i < row ; i++) {
           
            for (int j = i ; j < col ; j++) {
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp ;
            }
        }

         for (int i =0 ; i < row ; i++ ) {
            reverse(matrix , i) ;
         }
    }
    static void reverse(int[][] matrix , int row ) {
        int i =0 ;
        int j = matrix[0].length-1 ;

        while (i < j) {
            int temp = matrix[row][j] ;
                matrix[row][j] = matrix[row][i] ;
                matrix[row][i] = temp ;
                i++ ;j-- ;
        }
    }
}