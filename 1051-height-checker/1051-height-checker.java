class Solution {
    public int heightChecker(int[] heights) {
        int[] sortHeight = heights.clone();
        int n = sortHeight.length;
        for(int i = 0 ; i < n-1 ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(sortHeight[j] == sortHeight[j+1]){
                    continue;
                }else if (sortHeight[j]>sortHeight[j+1]){
                    int temp =sortHeight[j];
                    sortHeight[j] = sortHeight[j+1];
                    sortHeight[j+1] = temp;
                }
            }
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(sortHeight[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
} 