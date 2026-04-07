
class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> num1 = new HashSet<>();
        for(int i = 0; i < nums.length; i++ ){

            if(num1.contains(nums[i]) == true)
            {
                return true;
            }
            num1.add(nums[i]);
        }
        return false;
    }
}

/*
Example array named nums= [2,4,5,1,2]
=> Return true 

Time complexity: would O(nn^2)

My idea:
Using hashSet to do that
Craete an hashing named num1
for(int i =0; i< nums.length; i++)
    num1.add()
    if(num1.contains(num1[i])== true)
    return false

    return true
*/