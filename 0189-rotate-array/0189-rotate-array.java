class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int[] arr = new int[l];
        int j = l - k % l;  // safe even if k > l

        for (int i = 0; i < l; i++) {
            arr[i] = nums[j % l];
            j++;
        }

        // Copy back to nums
        for (int i = 0; i < l; i++) {
            nums[i] = arr[i];
        }
    }
}
