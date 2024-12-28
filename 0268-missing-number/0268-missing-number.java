class Solution {
    public int missingNumber(int[] nums) {
        int[] clone = nums.clone();
        Arrays.sort(clone);
        if (clone[0] != 0) {
            return 0;
        }
        for (int i = 0; i < clone.length - 1; i++) {
            if (clone[i + 1] - clone[i] != 1) {
                return clone[i] + 1;
            }
        }
        return clone[clone.length - 1] + 1;
    }
}
