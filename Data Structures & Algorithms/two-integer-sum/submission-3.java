class Solution {
    public int[] twoSum(int[] nums, int target){

/*
i=0
=> num = num[0] = 3
diff = 4

Hash Table 
idx = 3 : 0  

i=1
=> num = 4
diff = 3


*/
        HashMap<Integer, Integer> container = new HashMap<>();
        for(int i =0; i < nums.length; i++){
            int num = nums[i];
            int diff = target - num;
            if(container.containsKey(diff) == true){
                return new int[]{container.get(diff), i};
            }

            container.put(num,i);
        }

        return new int[]{};
    }
}
/*
Time complexity:
O(n^2)

Pseudocode:
We create an empty hashmap
firstly create an for loop 
    We will get the num = nums[i]
    diff = target - num
    We just need to find the diff in the hashtable we created
    => Using if else to check that have number in the hashmap equal to diff
    If yes return (i,that number)
    If no just put that num into the hashmap and move to next index in the array
*/