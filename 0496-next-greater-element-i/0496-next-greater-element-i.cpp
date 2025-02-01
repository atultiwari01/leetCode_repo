class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans;
        stack<int> st;
        unordered_map<int, int> map;
        
        for (int i : nums2) {
            while (!st.empty() && st.top() < i) {
                map[st.top()] = i;
                st.pop();
            }
            st.push(i);
        }
        
        for (int i : nums1) {
            ans.push_back(map.count(i) ? map[i] : -1);
        }
        
        return ans;
    }
};
