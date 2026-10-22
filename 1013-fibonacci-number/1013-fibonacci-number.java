class Solution {
    public int fib(int n) {
        if ( n <= 1) {
            return n ;
        }
        // int[] dp = new int[n+1] ;
        //  dp[0] = 0 ;
        //  dp[1] = 1 ;
        int prev2 = 0 ;
        int prev1 = 1 ;
        int ans = 0 ;

         for (int state = 2 ; state <= n ; state++) {
            // dp[state] = dp[state-1] + dp[state-2] ;
            ans = prev1 + prev2 ; 
            prev2 = prev1 ;
            prev1 = ans ;
           
         }
         
         return ans ;//dp[n] ;
    }

    // public int rec(int n ,int[]dp) {
    //     if ( n <= 1) {
    //         dp[n] = n;
    //         return dp[n] ;
    //     }
    //     if(dp[n] != -1) {
    //         return dp[n] ;
    //     }
    //     dp[n] = fib(n-1) + fib(n-2) ;
    //     return dp[n];
    // }
}