import java.util.Arrays;

class Solution {
    public static int heightChecker(int[] heights){
        int[] sortHeight = heights.clone();
        Arrays.sort(sortHeight);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (sortHeight[i] != heights[i]) {
                count++;
            }
        }
        
        return count;
    }
}