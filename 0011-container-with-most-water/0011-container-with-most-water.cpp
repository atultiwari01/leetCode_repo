class Solution {
    public:
        int maxArea(vector<int>& height) {
            int left = 0;
            int right = height.size()-1;
            int MaxArea = 0;
            while(left<right){
                int Area = min(height[left] , height[right])*(right-left);
                MaxArea = max(Area,MaxArea);
                if(height[left]<height[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
            return MaxArea;
        }
    };