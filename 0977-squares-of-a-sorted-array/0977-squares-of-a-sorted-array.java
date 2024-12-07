class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] SortedArray = nums.clone();
        for(int i=0;i<SortedArray.length;i++)SortedArray[i]=SortedArray[i]*SortedArray[i];
        Arrays.sort(SortedArray);
        return SortedArray;
    }
}