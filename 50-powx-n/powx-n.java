class Solution {
    public double myPow(double x, int N) {
        
        long n = N ;
        if ( n < 0) {
            x = 1/x ;
            n = -n ;
         
        }

         double ans = 1;

        while (n > 0) {
           
           if (n % 2 == 1) {
              ans *= x ;
              n = n-1 ;
           }

           else {
              n = n/2 ;
              x *= x;
           }
        }
        return ans ;
    }
}