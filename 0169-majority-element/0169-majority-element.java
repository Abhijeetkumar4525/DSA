class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length ;
        int maj = nums[0];
        int cnt = 1 ; 
        
        for(int i =1 ; i< n ; i++) {

            if(nums [i] == maj) {
               cnt++;
            } else if (cnt == 0){
                maj = nums[i];
            } else if (nums[i] != maj) {
                cnt--;
            }
            
        }
        return maj ;
    }
}