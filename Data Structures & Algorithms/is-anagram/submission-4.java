class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] s1 = s.toCharArray(); //O(n)
        char[] t1 = t.toCharArray();

        Arrays.sort(s1); // O(nlogn)
        Arrays.sort(t1);

        int i = 0;
        while(i < s.length()){  // O(n)
            if(s1[i] != t1[i]){
                return false; 
            }
            i++;
        }

        return true;
    }
}
/*
Test case 1
s = "car"
t = "arc"
Output: true car = arc

Test case 2:
s = "jam"
t = "jar"
Output: false 

Idea:
Brute force
Base case checking for the same length
Convert string s to char
Convert string t to char 
Arrange both s and t in order arrangement

int i = 0 
while(i < s.length()){
    if(char[s1] != char[t1]) return false
    i++
}
return true
*/