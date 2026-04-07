class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suff = new int[nums.length];

        pre[0] = 1;
        suff[nums.length-1] = 1;

        for(int i = 1; i < nums.length; i++){
            pre[i] = pre[i-1] * nums[i-1]; 
        }

        for(int i = nums.length -2; i>=0; i--){
            suff[i] = suff[i+1] * nums[i+1];
        }
        /*
        nums[1,2,3,4];
        suff[_,_,4,1];
             0 1 2 3

        i = 1 
        suff[] = suff[3] * nums[3];
        */
        
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            result[i] = pre[i] * suff[i];
        }

        return result;
    }
}  
/*
Test Case 1:
[1,2,3,4,5]
Output: [90, 1*3*4*5, ...]

[0,1,5,3]
Output: [15,0,0,0];

Idea

[1,2,3,4]
Output: [24,12,8,6]
pre[1,1,2,6]
suff[24,12,4,1] 
*/
