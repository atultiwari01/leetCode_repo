class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0; 
        int left = 0; 

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {
                
                left = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, right);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}