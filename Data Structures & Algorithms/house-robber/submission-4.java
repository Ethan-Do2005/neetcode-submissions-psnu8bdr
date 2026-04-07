class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n==0) return 0;
        if(n==1) return nums[0];

        int first = nums[0];
        int second = Math.max(nums[0],  nums[1]);
        int sum = 0;

        for(int i =2 ; i < n ; i++){
            sum = Math.max(first + nums[i], second);
            first = second;
            second = sum;
        }

        return second;
    }
//           i      
//     f   f s
// 2 9 8   3 6
//     10  1216
// sum = 16

}
