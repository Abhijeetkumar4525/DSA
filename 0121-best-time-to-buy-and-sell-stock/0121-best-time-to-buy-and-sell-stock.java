class Solution {
    public int maxProfit(int[] nums) {
        int buy = nums[0] ;
        int maxProfit  =0 ;

        for (int i = 1; i < nums.length ; i++) {
             int profit = nums[i] - buy ;

            if (nums[i] < buy ) {
                buy = nums[i] ;
            }

            maxProfit = Math.max(profit , maxProfit) ;
        }
        return maxProfit ;
    }
}