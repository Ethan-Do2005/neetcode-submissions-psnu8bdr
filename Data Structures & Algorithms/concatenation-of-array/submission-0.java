class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i = 0; i < n; i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        };
        return ans;
    }
}

/*
Step 1:
For example we have array length nums = [2,4,5,1]
Length nums would be: 4
ans[i] = nums[2,4,5,1]
+ i:0 => ans[i+n] = nums[5] = 2
+ i:1 => ans[i+n] = nums[6] = 4
...
Step 2:
Time complexity: O(n)

Step 3: Pesudocode
n= nums.legth
we create an new array named ans with length = 2*n
for (i = 0, i < n, i++)
    ans[i] = num[i]
    ans[i+n] = num[i]

We will return ans
*/