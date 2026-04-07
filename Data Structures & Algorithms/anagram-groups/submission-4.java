class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String str:strs){
            str.toLowerCase();
            int[] count = new int[26];
            for(char c : str.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(str);
        }

        return new ArrayList<>(result.values());
    }
}
/*
Contraints
Lowercase or Uppercase
=> Lowercase
Limitation for this Input List
=> No
Not contains specific symbol (semicolon, ) or digit number
=> Alphabelt

From Approach
Approach A: 
+ Having An List A contains anagram put it in List<List<>>
+ create int array and count each alpha character to check its existence following by alpha order

strs = ["act","pots","tops","cat","stop","hat"]

int['a','','c',.... 't',... ];
List A exits  'a','','c',.... 't',... => string act
List act {"act"}

pots
int ['','','t',.... 'o',.'p'..'s' ];
"tops" => 
List tops

tops
int ['','','t',.... 'o',.'p'..'s' ];
List tops {"pots", tops"}
*/