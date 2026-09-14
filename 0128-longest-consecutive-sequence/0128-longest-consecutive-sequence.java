class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length ;
        Arrays.sort(nums) ;

        int cnt = 1 ;
        int maxCnt = Integer.MIN_VALUE ;
        for (int i =1 ; i < n ; i++) {


               if (nums[i] - nums[i-1] == 1) {
                  cnt ++ ;
               } else if (nums[i] - nums[i-1] == 0) {
                     continue ;
               } else {
                  cnt = 1;
               }

               maxCnt = Math.max(cnt , maxCnt) ;
        }

         if (n == 1)  return 1  ;
         if (n == 0)  return 0 ;
         if(maxCnt == Integer.MIN_VALUE) return 1 ;
        return maxCnt ;
    }
}