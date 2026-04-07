class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);

            count[s1 - 'a']++;
            count[t1 - 'a']--;
        }

        for(int num : count){
            if(num != 0) return false;
        }

        return true;

    }
}
