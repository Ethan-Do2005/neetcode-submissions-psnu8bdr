class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        result[0] = 1;
        for(int i = 1; i < len; i++){
            result[i] = result[i-1] * nums[i-1]; 
        }

        int rightProduct = 1;
        for(int i = len-1; i >= 0; i--){
            result[i] = rightProduct * result[i];
            rightProduct = rightProduct * nums[i];
        }

        return result;

    }
}
/*
[1,2,4,6] 
[48,24,12,8]
48 = 2*4*6
24 = 1*4*6
...

Contrains
nums.length range
2 <= nums.length <= 10000
range each index
10^5 <= nums[i] <= 10^5 - i is index in array int
sorted array


Approach A: Prefix + Suffix 
For each index result: result[i] = total / nums[i]
[1,2,4,6]
[48,24,12,8]

Prefix [1,1,2,8]
Suffix [48,24,6,1]
*/
