class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int  l = nums.length;
        int repeat = 0;
        int max = 0;
        for(int i=0; i<l ; i++){
            if(nums[i]==1){
                repeat++;
            }
            else{
                max = Math.max(repeat,max);
                repeat = 0;
            }
            max = Math.max(repeat,max);
        }
        return max;
    }
}