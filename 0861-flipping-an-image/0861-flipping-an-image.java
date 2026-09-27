class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length ;
        int col = image[0].length ;

        // int[][] matrix = new int[col][row] ;

        for (int i =0 ; i < row ; i++) {
              reverse(image,i) ;
              
            for (int j =0 ; j < col ; j++) {

              

                if(image[i][j] == 1) {
                    image[i][j] = 0 ;
                } else if(image[i][j] == 0) {
                     image[i][j] = 1 ;
                }
            }
        }
        return image ;
    }
    static void reverse(int[][] image , int row) {
        int i = 0 ;
        int j = image[0].length-1 ;
        while (i < j) {
           int temp  = image[row][j] ;
           image[row][j] = image[row][i] ;
           image[row][i] = temp ;
           i++ ;
           j-- ;
        }
    }
}