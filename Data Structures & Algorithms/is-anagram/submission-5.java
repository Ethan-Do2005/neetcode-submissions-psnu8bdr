class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int count[] = new int[26];
        for( int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i = 0; i < count.length; i++){
            if(count[i] != 0){
                return false;
            }
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

Idea: Using array + counting logic
Base case checking for the same length
Convert string s to char
Convert string t to char

for char in s1 
    count[char - 'a']++;

the same t1
    count1

for loop to char each index in count1 = count 

*/