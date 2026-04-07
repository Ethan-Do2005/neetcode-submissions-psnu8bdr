class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int val : count){
            if(val != 0){
                return false;
            }
        }

        return true;
    }
}
/*
Test case 1:
s = "car"
t = "rca"
output: true 

Test case 2:
s = "jar"
t = "jam"
output: false

Idea: Array
base case where it return false if not same length

count[] = int[26]
for i loop
    count[s.charAt(i) - 'a']++;
    count[t.charAt(i) - 'a']++;

for loop
    check each index is not 0 => return false

return true
*/