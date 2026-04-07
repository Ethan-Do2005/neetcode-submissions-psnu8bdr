class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int length = 1;
                while(set.contains(num + length)){
                    length++;
                }
                max = Math.max(max, length);
            }
        }

        return max;
    }
}
/*
count++
if(exists i value in table) continue;
if(exists(i-1)value)
    count++;
if(not exists(i-1)value)
    temp = count;
    Max(temp, count);


*/
/*
Idea:
Using min heap to sort the array
Go through each nums[i]
based on that we check is that exits number that equal i+1 
If we add it into List of List integer 

*/