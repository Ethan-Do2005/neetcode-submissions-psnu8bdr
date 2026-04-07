class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> result = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            
            String key = Arrays.toString(count);
            result.putIfAbsent(key, new ArrayList<>());
            result.get(key).add(s);
        }

        return new ArrayList<>(result.values());
    }
}
/*
Test Case 1:
["car", "acr", "jar", "jam", "maj"]
Output: [["car", "acr"], ["jar"], ["jam", maj]]

Idea:
result = List<List<String>>
Using counting logic
    creating count[26]
    car [1,_1, _,_,_,1];
    acr [...]
    If same with previous table => Add to the car table
    jar []
    If not same with  => Create new table with that string

Return result
*/
