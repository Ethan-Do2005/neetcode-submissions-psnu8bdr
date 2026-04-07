class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int value = target - nums[i];

            if(map.containsKey(value)){
                return new int[] {map.get(value),i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};   
    }
}
/*
i = 0; 
value = target - 3 = 4
if(4)
map = [4:0, ]

i = 1;
value = 7 - 4 = 3

*/
/*
Test Case 1:
[1,2,3,4,5] target = 7
output: [3,4]

HashMap:
key-value
value: i 
*/
