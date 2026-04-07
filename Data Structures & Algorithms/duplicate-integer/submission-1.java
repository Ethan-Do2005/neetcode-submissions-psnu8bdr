class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}

/*
set[1,2,3,3] return true
set[0,1,2,7,8] return faslse
return false
Test case 3: []
Test case 1:
nums = [1,2,3,3] 
Output: true 
Explain: beacuse 3 appear two times 

nums = [0,1,2,7,8]
Output: false
Explain: because no number appear more two times 

Ideas: 
Worst Case:
Using two nested for loop
    If condition to check that it appear two times
        Return true;
Pseudocode 
For i in nums
    For j = i + 1 in nums
        if(nums[j] == nums[i])
            return true

return false; 

Ideas:
HashSet
calling Set<>
    for num in nums 
        if set.contains(num) return true
        set.add(num)
    
    return true


*/