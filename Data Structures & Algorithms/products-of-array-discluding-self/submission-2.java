class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        prefix[0] = 1;
        suffix[n-1] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }

        for(int i = n-2; i>=0 ; i-- ){
            suffix[i] = suffix[i+1] * nums[i+1];
        }

        for(int i = 0; i<n;i++){
            result[i] = prefix[i] * suffix[i];
        }
        return result;
    }
}  
/*
We will create a prefix algorithms:

prefix = [1,1,2,8] (with size length)

We will create a suffix algorithms:

suffix = [48,24,6,1] (with size length)

nums =   [-1,0,1,2,3]
prefix = [1,-1,0,0,0]

suffix = [0,6,6,3,1]
*/