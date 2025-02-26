class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] indexedNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            indexedNums[i][0] = nums[i];
            indexedNums[i][1] = i;
        }
        Arrays.sort(indexedNums, (a, b) -> Integer.compare(a[0], b[0]));
        
        int left = 0, right = nums.length - 1;
        
        while (left < right) {
            int sum = indexedNums[left][0] + indexedNums[right][0];
            
            if (sum == target) {
                return new int[]{indexedNums[left][1], indexedNums[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }
    
}
