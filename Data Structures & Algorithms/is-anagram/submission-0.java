class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s2);
        Arrays.sort(s1);

        return Arrays.equals(s1,s2);
    }
}

/*
Time complexity is this one 
O(n^2)

Pseudocode:
Arrays.sort(s);
Arrays.sort(t);
for(int i,j = 0, i<s.length, j<t.length, i++,j++){
    if(i==j){
        return true
    }
    return false
}

*/
