class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            
            map.put(nums[i],i);
        }

        return new int[] {};
    }
}
/*
nums[3,4,5,6] target = 9
i = 0 => 3 
map = [3:0 ; ];
i = 1 => 4 (9-4 = 5)
map = [3:0 ; 4:1;]
i = 2 => 5 (9-5 = 4)
{1,2}



Is that sorted or unsorted array?
Is that also include the negative number? 

Test case 1:
nums = [1,5,6,4] target = 7
Output: [0,2]

Test case 2:
nums = [5,5] target = 10;
Output: [0,1]

Idea
Brute force: 
for i in loop
    for j = i+1 in loop 
        if(nums[i] + nums[j] == target) returne new int[]{i,j}

    
    return;

O(n^2) and O(n) space

Idea 2:
Calling Hashmap
    for i loop 
        if(map exist(target - nums[i])) return {key of value, i }
        table.add(nums[i]);
*/
