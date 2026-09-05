class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        seen = {}

        for str in strs:
            count = [0] * 26
            for c in str:
                count[ord(c) - ord('a')]+= 1

            key = tuple(count)

            if key not in seen:
                seen[key] = []
            
            seen[key].append(str)
        
        return list(seen.values())
        