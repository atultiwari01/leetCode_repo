class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i] == target || nums[i] > target ){
                break;
            }
            else{
                count ++;
            }
        }
        return count;
    }
}