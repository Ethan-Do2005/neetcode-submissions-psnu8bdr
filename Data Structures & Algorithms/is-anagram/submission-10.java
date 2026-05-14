class Solution {
    public boolean isAnagram(String s, String t) {
        int[] count = new int[26];

        if(s.length() != t.length()){
        return false;
        }

        for(int i = 0; i < s.length(); i++){
        char c1 = s.charAt(i);
        char c2 = t.charAt(i);

        count[c1 - 'a']++;
        count[c2 - 'a']--;
        }

        for(int num : count){
        if(num != 0){
            return false;
        }
        }

        return true;
    }
}

/*
[racecare] [carrace]
true

[jar] [jam]
false

Contraints
is that always lower or Upper char ? 
=> lower
how's the limitation length the string 
=> No limit

2 Two Approach
Approach A: brute force
however having to sorted the string[] => 
Time complex O(nlogn)
Space complext O(n)

Approach B: putting each char into array following by order in alphabet
[jar] [jam]

count[26]
[,'', ..'r'.. ,]

[    'm'        ]

return false
Time O(n)
Space O(1)
*/
