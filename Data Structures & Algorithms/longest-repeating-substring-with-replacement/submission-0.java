class Solution {
    public int characterReplacement(String s, int k) {
        int l =0;
        int res = 0;
        int maxFreq = 0;
        int[] count = new int[26];

        for(int r = 0; r < s.length(); r++){
            int idx = s.charAt(r) - 'A';
            count[idx]++;

            maxFreq = Math.max(maxFreq, count[idx]);

            while((r-l + 1) - maxFreq > k){
                count[s.charAt(l) - 'A']--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
