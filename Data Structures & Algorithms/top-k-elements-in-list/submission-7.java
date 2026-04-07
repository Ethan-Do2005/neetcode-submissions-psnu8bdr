class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> storeNumber = new HashMap<>();

        //Using HashMap
        for(int num : nums){
            storeNumber.put(num, storeNumber.getOrDefault(num, 0) + 1);
        }

        // Index = value and list[index] = key
        List<Integer>[] arrangeNumber = new List[nums.length + 1];

        for(Map.Entry<Integer, Integer> entry : storeNumber.entrySet()){
            int value = entry.getKey();
            int index = entry.getValue();
            if(arrangeNumber[index] == null){
                arrangeNumber[index] = new ArrayList<>();
            }
            arrangeNumber[index].add(value);
        }

        //return result based on List from backward
        int[] result = new int[k];
        int index = 0;
        for(int i = nums.length; i > 0; i--){
            if(arrangeNumber[i] != null){
                for(int num : arrangeNumber[i]){
                    result[index++] = num;
                    if(index == k){
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
value: freq
1:1
2:2
3:3

[3,2]

Constraints:
Sorted or unsorted?
=> unsorted
Contains negative number?
=> No
-1000 < num[i] < 1000
nums < 1000

Appoach A:
Approach B: bucekt sort 
+ Using Hashmap -> to count freq of num
+ Using List -> put freq based on num index
+ Using Array -> to return the k num from List
Step 1:
[1,2,2,3,3,3]
[1:1, 2:2, 3:3]

Step 2:
[1,2,3,null,null,..] size = nums.length

Step 3:
size-1 to 0 from List in step 2
[3,2];

*/