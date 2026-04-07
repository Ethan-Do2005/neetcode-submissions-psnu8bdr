class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int res = 0;
        HashSet<Character> set = new HashSet<>();

        for(int r = 0; r < s.length(); r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
/*
Idea 
"zxyzxyz"
l = 0;
res = 0;
Set
zxyz
xyzx
=>yzx
for r in loop
    exists string[r] in HashSet
        remove string[l]
        l++;
    
    add string[r] in Set
    res = max(res, r - l + 1)

    return res
*/