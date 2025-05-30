class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n =nums.length;
        int result[] = new int[n];
        int left[] = new int[n];        
        left[0]=1;
        for(int i = 1; i < n; i++){
            left[i] = left[i-1] * nums[i-1];
        }
        int right[] = new int[n]; 
        right[n-1] = 1;
        for(int i = n - 2; i >= 0; i--){
            right[i] = right[i+1]*nums[i+1];
            // result[i] *= right;
            // right *= nums[i];
        }
        for (int i = 0; i < n; i++) {
            result[i]=left[i]*right[i];
        }
        return result;
    }
}