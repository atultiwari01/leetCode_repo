class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int  l = nums.length;
        int repeat = 0;
        int max = 0;
        for(int i=0; i<l ; i++){
            if(nums[i]==1){
                repeat++;
            }
            if(nums[i] != 1 || i == (l-1)){
                max = Math.max(repeat,max);
                repeat = 0;
            }
        }
        return max;
    }
}