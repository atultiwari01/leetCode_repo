class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // for(int i =0 ; i<nums.length;){
        //     int index = nums[i];
        //     if(nums[i]<n&&nums[i]!=nums[index]){
        //         int a=nums[index];
        //         nums[index]=nums[i];
        //         nums[i]=a;
        //     }
        //     else{
        //         i++;
        //     }
        // }
        Arrays.sort(nums);
        for(int i = 0; i<n ; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
}
