class Solution {
    public int lengthOfLongestSubstring(String str) {
        int maxLength = 0;

        Map<Character, Integer> hashMap = new HashMap<>();
        int start = 0;
        for (int end = 0; end < str.length(); end++) {

            char c = str.charAt(end);

            if (hashMap.containsKey(c)) {
                start = Math.max(start, hashMap.get(c) + 1);
            }

            hashMap.put(c, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
        
        
    }
}
