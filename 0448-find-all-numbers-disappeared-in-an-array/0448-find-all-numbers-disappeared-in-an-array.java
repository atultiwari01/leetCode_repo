import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        i =0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<nums.length){
            if(nums[i]!=i+1){
                result.add(i+1);
            }
            i++;
        }
        return result;
    }
}
