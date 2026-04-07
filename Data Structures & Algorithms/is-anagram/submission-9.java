class Solution {
    public boolean isAnagram(String s, String t) {
        
        //Base Case
        if(s.length() != t.length()){
            return false;
        }

        int[] count = new int[26];
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        for(int i = 0; i < s.length(); i++){
            count[s1[i] - 'a']++;
            count[t1[i] - 'a']--;
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
