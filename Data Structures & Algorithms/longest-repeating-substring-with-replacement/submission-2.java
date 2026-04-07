class Solution {
    public int characterReplacement(String s, int k) {
        int i = 0;
        int maxLen = 0;
        int maxFreq = 0;
        int[] count = new int[26];

        for(int j = 0; j < s.length(); j++){
            char c = s.charAt(j);
            count[c - 'A']++;
            maxFreq = Math.max(maxFreq, count[c - 'A']);

            while((j - i + 1) - maxFreq > k){
                count[s.charAt(i) - 'A']--;
                i++;
            }
            
            maxLen = Math.max(j - i + 1, maxLen);
        }

        return maxLen;
    }
}
/*
My approach for this one 
Sliding window by know that 
Window size - maxFreq > k

XYYX
i = 0;
j = 0;

j = 2; XYY --> maxFreq = 2 ; window Size = 3
3 - 2 = 1 > 2

j = 3; XYYX --> maxFreq = 2 ; window Size = 4
4 - 2 = 2 > 2

*/