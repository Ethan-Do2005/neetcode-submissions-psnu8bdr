class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();

        for(String s : strs){
            s = s.toLowerCase();
            int[] count = new int[26];
            for(char c : s.toCharArray()){
                count[c - 'a']++;
            }
            
            String key = Arrays.toString(count);
            
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }

        return new ArrayList<>(res.values());
    }
}
/*
Testcase 1
["car", "rac", "ttt", "aaa"]
Output: [["car", "rac"], ["ttt"], ["aaa"]]
List of List

Anagrams (Counting logic):
+ counting logic (where create int[26])
+ count freq of each character

Checking exits Put it in List
*/