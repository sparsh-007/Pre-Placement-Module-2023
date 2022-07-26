class Solution {
    public boolean checkInclusion(String s1, String s2) {
          int[] map_array = new int[26];
        for(char c1 : s1.toCharArray()) map_array[c1 - 'a']++;
        int j = 0, i = 0;
        int count_chars_inarray = s1.length();
        while(j < s2.length()){
            if(map_array[s2.charAt(j++) - 'a']-- > 0)
                count_chars_inarray--;
            if(count_chars_inarray == 0) return true;
            if(j - i == s1.length() && map_array[s2.charAt(i++) - 'a']++ >= 0)
                count_chars_inarray++;
        }
        return false;
        
    }
}
