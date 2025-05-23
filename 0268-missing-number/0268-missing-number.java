class Solution {
    public int missingNumber(int[] nums) {
        int i  = 0;
        while(i<nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i]=nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        i = 0;
        while(i<nums.length){
            if(nums[i] != i){
                return i;
            }else{
                i++;
            }
        }
        return nums.length;
    }
}