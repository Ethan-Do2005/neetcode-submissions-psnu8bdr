class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        //Counting frequency Element
        Map<Integer, Integer> countElement = new HashMap<>();
        for(int num : nums){
            countElement.put(num, countElement.getOrDefault(num, 0) +1);
        }

        //Arrange frequency element by order
        List<Integer>[] arrangeElement = new List[nums.length+1];
        for(Map.Entry<Integer, Integer> entry : countElement.entrySet()){
            int indexList = entry.getValue();
            int valueList = entry.getKey();
            if(arrangeElement[indexList] == null){
                arrangeElement[indexList] = new ArrayList<>();
            }
            arrangeElement[indexList].add(valueList);
        }
        
        // return result
        int[] result = new int[k];
        int index = 0;
        for(int i = arrangeElement.length-1; i >= 0; i--){
            if(arrangeElement[i] != null){
                for(int num : arrangeElement[i]){
                    result[index++] = num;

                    if(index >= k){
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
/*
[1,2,2,3,3,3] k = 2

[3,2] 3:3 then 2:2

Contraints
Is this the sorted or unsorted?
-> Unsorted
What the range for each index
-10^5 <= nums[i] < 10^5 i: index in nums

Approach A: bucket sort 
[1,2,2,3,3,3,3,3]
Step 1: Using HashMap
+ Count the freq of element 
{1:1, 2:2, 3:5} - key:value
Step 2: Using fixed size List[]
+ To contains element frequent
+ Arrange in order relative from highest lowest 
key: = value in List[]
value: = index in List[]
3:5
[1,2,null,null,3] size 8 
Step 3: Return result
+ Right to Left
[3,2]

Time Complexity: O(n)
Space complexity: O(n)
*/