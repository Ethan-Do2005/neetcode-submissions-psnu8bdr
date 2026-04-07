class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // for(int i = 0; i < strs.length; i++){
        //     strs[i] = new HashMap<>();
        // }

        for(String index:strs){
            int[] count = new int[26];
            for(char c : index.toCharArray()){
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(index);

        }

        return new ArrayList<>(map.values());
    }
}
/*
Step 1: Have to create list of hashmap
Step 2:  Logic character
Step 3: Re-change from char to String 
Step 4: Is that logic character exists yet 
Step 5: return


act & cat
[_,_,_,_,...]
act:
+ a: 1st index
+ c: 3rd index
+ t: 10th index

[a,_,c,_,_...,_t_,_,...]

cat:
+ c: 3rd index
+ a: 1st index
+ t: 10th index
[a,_,c_,.....,_t_,_,....]
*/