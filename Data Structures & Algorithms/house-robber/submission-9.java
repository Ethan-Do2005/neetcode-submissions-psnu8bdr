class Solution {
    public int rob(int[] nums) {
    int n = nums.length;

    if(n == 0) return 0;
    if(n == 1) return nums[0];
    if(n == 2) return Math.max(nums[0], nums[1]);

    int first = nums[0];
    int second = Math.max(nums[0], nums[1]);
    int sum = 0;

    for(int i = 2; i < n; i++){
        sum = Math.max(second, first + nums[i]);
        first = second;
        second = sum;
    }
    return second;

    }

}



/*
               f s 
5 1 2 10 6 2 7 9 3 1  
    7
      11
         13
           13
             20
               29
                 29
                   i

sum = (29,30) => 29

compare s with f + i 
=> Take of (s, f + i)

sum
*/