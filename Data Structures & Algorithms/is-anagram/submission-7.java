class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        if(s.length() != t.length()) return false;
        
        String s1 = s.toLowerCase();
        String s2 = t.toLowerCase();

        for(int i = 0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int value : count){
            if(value != 0){
                return false;
            }
        }
        return true;
    }
}
/*
Test case1:
s = "car" t = "arc"
Output: true
Test case2:
s = "" t = "tar";
Output: false

Idea:

*/