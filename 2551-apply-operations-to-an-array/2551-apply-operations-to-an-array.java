class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length ;
        int[] arr = new int[n] ;

        for (int i =0 ; i < n-1 ; i++) {

            if(nums[i] == nums[i+1]) {
                arr[i] = nums[i]*2 ;
                 nums[i+1] = 0;
            }
               
            else if(nums[i] != nums[i+1]) {
                arr[i] = nums[i] ;
            }
            arr[arr.length-1] = nums[n-1] ;
        }
         int j = 0;

        for (int i = 0; i < n; i++) {

            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }  
        return arr ;
    }
}