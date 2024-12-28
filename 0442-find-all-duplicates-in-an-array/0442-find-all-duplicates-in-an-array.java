import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length;) {
            int index =nums[i]-1;
            if (nums[i] != nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        List<Integer> num = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1 && !num.contains(nums[i])) {
                num.add(nums[i]);
            }
        }
        
        return num;
    }
}
