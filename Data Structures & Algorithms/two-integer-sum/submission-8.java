class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> storage = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int findingTarget = target - nums[i];
            if(storage.containsKey(findingTarget)){
                return new int[]{storage.get(findingTarget), i};
            }
            storage.put(nums[i], i);
        }

        return new int[]{};  
    }
}
/*
[3,4,5,6] target = 7

[0,1]
3 + 4 = 7 == 7

Contraints
Sorted or Unsorted ?
=> Sorted
Do it contains duplicate number ? 
=> Yes
Range limitation
10^5 <= nums[i] <= 10^5 : i is index in num
Do it cotains negative number 
No

2 Approach
Approach A: Using brute force
using 2 nested loop to check it 
Time and Space complexity O(n^2) and O(n)

Approach B: Using hashmap by key-value definition
[3,4,5,6]

3
Foundtarget = 7-3 = 4
[1: 3, ]
4
Foundtarget = 7 - 4 = 3
Return 0,1

*/