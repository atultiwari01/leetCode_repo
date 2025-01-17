class Solution {
    public int rob(int[] nums) {
    if (nums.length == 1) {
        return nums[0];
    }

    int[] loot = new int[nums.length];
    loot[0] = nums[0];
    loot[1] = Math.max(nums[0], nums[1]);

    for (int house = 2; house < nums.length; house++) {
      loot[house] = Math.max(loot[house - 2] + nums[house], loot[house - 1]);
    }

    return loot[nums.length - 1];
    }
}