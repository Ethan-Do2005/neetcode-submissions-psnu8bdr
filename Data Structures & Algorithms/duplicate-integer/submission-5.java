class Solution{
    public boolean hasDuplicate(int[] nums){
        Set<Integer> storage = new HashSet<>();

        for(int num : nums){
            if(storage.contains(num)){
                return true;
            }
            storage.add(num);
        }

        return false;
    }
}

/*
nums[1,2,3,3]
output: true
[1,2,3]
output: false

Constraints
nums[i] <10^5 where i is index in nums
Always positive
Always sorted

Approach
Approach A: brute force
=> 2 nested for loop and set 1 index compare with another index 
Time complex O(n^2) where n is length(num) 
Space complex O(n) where it contains n length(n)

Approach B: HashSet
=> Using hashset it put in hashset and check for each index
Time complex O(n) and Space O(n)

[1,2,3,3]
Using hashset
1 -> not exist before: add in set
2 -> not: add
3 -> not: add
3 -> yes: return true
*/