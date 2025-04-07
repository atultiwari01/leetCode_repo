class Solution {
    public boolean judgeSquareSum(int c) {
        // Mark 'c' smaller than 0 'false'
        if(c<0) return false;

        // Two Pointer Approach foe actual Problem
        long left = 0;
        long right = (int) Math.sqrt(c);
        while(left<=right){
            long sum = left*left + right*right;
            if(sum == c){
                return true;
            }
            else{
                if(sum<c){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return false;

    }
}